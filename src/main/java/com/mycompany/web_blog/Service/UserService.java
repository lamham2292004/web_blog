package com.mycompany.web_blog.Service;

import com.mycompany.web_blog.Model.User;
import com.mycompany.web_blog.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired private UserRepository repo;

    public List<User> listAll() {
        return (List<User>) repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }

    public User get(Integer id) throws UserNotFoundException {
        Optional<User> result = repo.findById(id);
        if (result.isPresent()){
            return result.get();
        }
        throw new UserNotFoundException("could not find any users with ID "+ id);
    }

    public void delete(Integer id) throws UserNotFoundException {
        Long cout = repo.countById(id);
        if (cout == null || cout == 0){
            throw new UserNotFoundException("could not find any users with ID "+ id);
        }
        repo.deleteById(id);
    }
}
