package com.myproject.linkedin.post_service.repository;

import com.myproject.linkedin.post_service.dto.PostDto;
import com.myproject.linkedin.post_service.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
