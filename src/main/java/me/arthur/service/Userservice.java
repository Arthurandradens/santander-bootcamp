package me.arthur.service;

import me.arthur.domain.model.User;

public interface Userservice {

    User findById(Long id);

    User create(User userToCreate);
}
