package com.myproject.linkedin.post_service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostDto {

    private Long id;
    private Long content;
    private Long postId;
    private LocalDateTime createdAt;
    private String createdBy;
}
