package com.myproject.linkedin.post_service.service;

import com.myproject.linkedin.post_service.dto.PostCreateRequestDto;
import com.myproject.linkedin.post_service.dto.PostDto;
import com.myproject.linkedin.post_service.entity.Post;
import com.myproject.linkedin.post_service.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostService {

    private final PostRepository postRepository;
    private final ModelMapper modelMapper;
    public PostDto createPost( PostCreateRequestDto postCreateRequestDto, Long userId ) {
        Post post = modelMapper.map(postCreateRequestDto, Post.class);
        post.setUserId(userId);

        Post savePost = postRepository.save(post);
        return modelMapper.map(savePost, PostDto.class);

    }
}
