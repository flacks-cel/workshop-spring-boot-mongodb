package com.flaviolacksworkshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.flaviolacksworkshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
