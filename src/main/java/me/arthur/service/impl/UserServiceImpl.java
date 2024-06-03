package me.arthur.service.impl;

import me.arthur.domain.model.User;
import me.arthur.domain.repository.UserRepository;
import me.arthur.service.Userservice;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements Userservice {
    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (!repository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
           return repository.save(userToCreate);
        }
        throw new IllegalArgumentException("This Account Number already exists");
    }
}
