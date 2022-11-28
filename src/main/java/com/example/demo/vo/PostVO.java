package com.example.demo.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Data
public class PostVO {

    private Long id;

    @NotNull(message = "the title is required")
    @NotEmpty(message = "the title is required")
    @Size(max = 40,message = "the title should be shorter")
    private String title;
    @NotEmpty(message = "the body is required")
    private String body;
}