package com.example.demo.Service;

import com.example.demo.Business.Model.posts.Post;
import com.example.demo.vo.PostVO;

import java.util.List;

public interface PostService {

    List<Post> getAllPosts(int page, int size); //1000000 POSTS ->- GIVE FROM 1 TO 100 -> 101->200

    List<Post> getPostsByCreatedBy(String username, int page, int size);
    List<Post> getPostsByCategory(Long cateId,int page, int size);
    List<Post> getPostsByTag(Long tagId,int page, int size);
    Post updatePost (Long id/* newPostRequest, currentUser*/);
    Boolean deletePost (Long id/*  currentUser*/);
    Post getPost(Long id);
    PostVO addPost(PostVO newPostRequest/*, currentUser*/);
}
