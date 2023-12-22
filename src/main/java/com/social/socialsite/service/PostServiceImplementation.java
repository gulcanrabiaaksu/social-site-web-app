package com.social.socialsite.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.socialsite.models.Post;
import com.social.socialsite.models.User;
import com.social.socialsite.repository.PostRepository;

@Service
public class PostServiceImplementation implements PostService{

	@Autowired
	PostRepository postRepository;
	
	@Autowired
	UserService userService;

	@Override
	public Post createNewPost(Post post, Integer userId) throws Exception {
		
		User user =userService.findUserById(userId);
		
		Post newPost=new Post();
		newPost.setCaption(post.getCaption());
		newPost.setImage(post.getImage());
		//newPost.setCreatedAt(new LocalDateTime()));
		newPost.setVideo(post.getVideo());
		newPost.setUser(user);
		
		return newPost;
	}

	@Override
	public String deletePost(Integer postId, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> findPostByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post findPostById(Integer postId) throws Exception {
		Optional<Post> opt =postRepository.findById(postId);
		if(opt.isEmpty()) {
			throw new Exception ("post not found with id"+ postId);
		}
		return opt.get();
	}

	@Override
	public List<Post> findAllPost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post savedPost(Integer postId, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post likePost(Integer postId, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
 
}
