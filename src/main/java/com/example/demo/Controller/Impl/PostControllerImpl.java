package com.example.demo.Controller.Impl;

import com.example.demo.Controller.PostController;
import com.example.demo.Service.PostService;
import com.example.demo.vo.PostVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostControllerImpl implements PostController {
    @Autowired
    PostService postService;

    @Override
    public ResponseEntity<PostVO> getPost(long id) {
        return ResponseEntity.ok(new PostVO());
    }

    @Override
    public ResponseEntity<PostVO> save(PostVO postVo) {
        return ResponseEntity.ok(postService.addPost(postVo));
    }
}
