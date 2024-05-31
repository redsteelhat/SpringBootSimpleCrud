package com.redsteel.SpringBootSimpleCrud.repository;

import com.redsteel.SpringBootSimpleCrud.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}