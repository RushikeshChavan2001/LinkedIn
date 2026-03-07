package com.myproject.linkedin.post_service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostCreateRequestDto {
    private String content;
}
