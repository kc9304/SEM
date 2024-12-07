package com.klef.jfsd.exam;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CommentService {

    private final RestTemplate restTemplate;

    public CommentService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchAllComments() {
        String url = "https://jsonplaceholder.typicode.com/comments";
        return restTemplate.getForObject(url, String.class);
    }
}
