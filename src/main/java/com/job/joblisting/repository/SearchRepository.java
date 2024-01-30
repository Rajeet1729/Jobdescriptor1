package com.job.joblisting.repository;

import com.job.joblisting.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SearchRepository {

    List<Post> findByText(String text);

}
