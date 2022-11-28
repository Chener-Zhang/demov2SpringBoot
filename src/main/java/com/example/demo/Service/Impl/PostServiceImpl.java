package com.example.demo.Service.Impl;

import com.example.demo.Business.Model.posts.Post;
import com.example.demo.Repository.PostRepository;
import com.example.demo.Service.PostService;
import com.example.demo.vo.PostVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository repo;

    @Override
    public List<Post> getAllPosts(int page, int size) {
        return null;
    }

    @Override
    public List<Post> getPostsByCreatedBy(String username, int page, int size) {
        return null;
    }

    @Override
    public List<Post> getPostsByCategory(Long cateId, int page, int size) {
        return null;
    }

    @Override
    public List<Post> getPostsByTag(Long tagId, int page, int size) {
        return null;
    }

    @Override
    public Post updatePost(Long id) {
        return null;
    }

    @Override
    public Boolean deletePost(Long id) {
        return null;
    }

    @Override
    public Post getPost(Long id) {
        return null;
    }

    @Override
    public PostVO addPost(PostVO newPostRequest) {

        Post post=new Post(); //do best practice for that
        post.setTitle(newPostRequest.getTitle());
        post.setBody(newPostRequest.getBody());

        post= repo.save(post);

        PostVO vo= new PostVO();
        vo.setId(post.getId());
        vo.setTitle(post.getTitle());
        vo.setBody(post.getBody());

        return vo;
    }


}
