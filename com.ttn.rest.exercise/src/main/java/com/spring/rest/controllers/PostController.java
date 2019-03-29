package com.spring.rest.controllers;

import com.spring.rest.entities.Post;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class PostController {
    // Get one post
    @GetMapping("/postObject")
    public Post getPostObject() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        ResponseEntity<Post> response = restTemplate.getForEntity(url, Post.class);
        System.out.println(response.getStatusCode().toString());
        System.out.println(response.getHeaders().toString());
        return response.getBody();
    }
    
    // Get a list of posts
    @GetMapping("/postList")
    public List<Post> getPostList() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts";
        ResponseEntity<List<Post>> response = restTemplate
                .exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Post>>() {
                });
        return response.getBody();
    }
    
    // Create new post
    @PostMapping("/createPost")
    public ResponseEntity<Post> createPost() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-type", "application/json; charset=UTF-8");
        HttpEntity<Post> request = new HttpEntity<>(new Post(10000L, 10000L, "title1", "description1"), httpHeaders);
        Post post = restTemplate.postForObject(url, request, Post.class);
        System.out.println(post);
        return new ResponseEntity<Post>(post, HttpStatus.CREATED);
    }
    
    // Update a post
    @PutMapping("/updatePost")
    public ResponseEntity<Post> updatePost() {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-type", "application/json; charset=UTF-8");
        HttpEntity<Post> request = new HttpEntity<>(new Post(1L, 100L, "title1", "description1"), httpHeaders);
        return restTemplate.exchange(url, HttpMethod.PUT, request, Post.class);
    }
    
    // Delete a post
    @DeleteMapping("/deletePost")
    public void deletePost() {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-type", "application/json; charset=UTF-8");
        HttpEntity<Post> request = new HttpEntity<>(httpHeaders);
        restTemplate.exchange(url, HttpMethod.DELETE, request, Post.class);
    }
}
