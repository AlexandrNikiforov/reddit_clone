package com.vega.springit.service;

import com.vega.springit.domain.User;
import com.vega.springit.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return user;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public void saveUsers(User... users) {
        for(User user : users) {
            log.info("Saving User: " + user.getEmail());
            userRepository.save(user);
        }
    }


}
