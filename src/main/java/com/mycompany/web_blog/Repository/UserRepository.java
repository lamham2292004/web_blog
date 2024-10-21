package com.mycompany.web_blog.Repository;

import com.mycompany.web_blog.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends CrudRepository <User, Integer> {
    public Long countById(Integer id);
}

