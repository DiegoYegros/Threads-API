package com.threads.threadsapi.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.threads.threadsapi.Utils.Constants;
import com.threads.threadsapi.dto.UserBasicInfo;
import com.threads.threadsapi.dto.Threads.ThreadsApiData;
import com.threads.threadsapi.mapper.ThreadsMapper;

@Service
public class ThreadsService implements IThreadsService{
    @Override
    public UserBasicInfo getUserBasicInfo(String userId) {
        MultiValueMap<String, String> bodyValues = new LinkedMultiValueMap<>();
        bodyValues.add("lsd", Constants.THREADS_LSD);
        bodyValues.add("variables", "{\"userID\":\""+userId+"\"}");
        bodyValues.add("doc_id", Constants.THREADS_DOC_ID);
        
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(bodyValues, getHeaders(null, null));
        RestTemplate restTemplate = new RestTemplate();
        
        ResponseEntity<String> response = restTemplate.exchange(Constants.THREADS_URL, HttpMethod.POST, request, String.class);
        if (response.getStatusCode().isError()){
            return null;
        }
        String json = response.getBody();
        if (!json.trim().startsWith("{")){
            json = "{"+json;
        }
        ObjectMapper mapper = new ObjectMapper();
        ThreadsApiData threadsApiData = null;
        try{
            threadsApiData = mapper.readValue(json, ThreadsApiData.class);
        } catch (Exception e){
            return null;
        }
        if (threadsApiData == null){
            return null;
        }
        return ThreadsMapper.mapUserBasicInfo(threadsApiData.getData());
    }

    @Override
    public String getUserIDFromUsername(String username) {
        MultiValueMap<String, String> bodyValues = new LinkedMultiValueMap<>();
        bodyValues.add("lsd", Constants.THREADS_ROUTE_LSD);
        bodyValues.add("route_urls[0]", "/@"+username);
        bodyValues.add("__a", "1");
        bodyValues.add("__comet_req", "29");
        bodyValues.add("lsd", Constants.THREADS_ROUTE_LSD);
        HttpHeaders headers = getHeaders(Constants.X_FB_LSD, username);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(bodyValues, headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(Constants.THREADS_ROUTE_URL, HttpMethod.POST, request, String.class);
        String jsonString = response.getBody();
        if (jsonString == null){
            return "No se encontro el usuario";
        }

        jsonString = jsonString.replace("for (;;);", "");
        jsonString = jsonString.replace("\\u0040", "");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = null;
        try {
            rootNode = mapper.readTree(jsonString);
        } catch (Exception e) {
            return null;
        }
        if (rootNode == null){
            return null;
        }
        String pretty = rootNode.toPrettyString();
        String userId = rootNode.path("payload")
            .path("payloads")
            .path("/"+username)
            .path("result")
            .path("exports")
            .path("rootView")
            .path("props")
            .path("user_id").asText();
        return userId;
    }
    HttpHeaders getHeaders(String xFbLsd, String username){
        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Educational Purposes Only");
        headers.add("Content-Type", "application/x-www-form-urlencoded");
        if (xFbLsd != null){
            headers.add("X-FB-LSD", xFbLsd);
            headers.add("referer", "https://www.threads.net/@"+username);
        }
        else{
            headers.add("X-FB-LSD", "WhfyA-XzijXoICbNvxBrbp");
            headers.add("Sec-Fetch-Site", "same-origin");
            headers.add("X-IG-App-ID", "238260118697367");
        }
        return headers;
    }    
}
