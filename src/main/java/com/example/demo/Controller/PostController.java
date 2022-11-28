package com.example.demo.Controller;

import com.example.demo.Business.Model.posts.Post;
import com.example.demo.Utils.ApiPath;
import com.example.demo.vo.PostVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping(ApiPath.API + ApiPath.Post.PATH)// "localhost/api/post/1"
public interface PostController {

    @GetMapping
    ResponseEntity<PostVO> getPost(@PathVariable("id") long id);
    @PostMapping //api/post
    ResponseEntity<PostVO> save(@Valid @RequestBody PostVO postVo);
}
