package com.stim.example.mvc_demo.repositorys;

import com.stim.example.mvc_demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
