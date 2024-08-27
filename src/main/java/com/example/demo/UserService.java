package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tej.JooQDemo.jooq.sample.model.tables.records.UserRecord;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserRecord> getAllUsers() {
        return userRepository.findAllUsers();
    }

    public UserRecord getUserById(int id) {
        return userRepository.findUserById(id);
    }

    public void addUser(UserDTO userDTO) {
        UserRecord record = new UserRecord();
        record.setName(userDTO.getName());
        record.setEmail(userDTO.getEmail());
        record.setPassword(userDTO.getPassword());
        userRepository.insertUser(record);
    }

    public void updateUser(int id, UserDTO userDTO) {
        UserRecord record = new UserRecord();
        record.setId(id);
        record.setName(userDTO.getName());
        record.setEmail(userDTO.getEmail());
        record.setPassword(userDTO.getPassword());
        userRepository.updateUser(record);
    }

    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }
}