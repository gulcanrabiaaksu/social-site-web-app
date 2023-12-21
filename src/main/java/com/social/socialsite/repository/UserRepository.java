package com.social.socialsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.socialsite.models.User;

public interface UserRepository extends JpaRepository <User,Integer>{

}
