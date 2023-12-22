package com.social.socialsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.socialsite.models.Post;

public interface PostRepository extends JpaRepository <Post,Integer>{

}
