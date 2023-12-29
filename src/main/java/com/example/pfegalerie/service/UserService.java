package com.example.pfegalerie.service;

import com.example.pfegalerie.entity.User;
import com.example.pfegalerie.interfaces.UserInterface;
import com.example.pfegalerie.modelDto.UserDto;
import com.example.pfegalerie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements UserInterface {

    @Autowired
    UserRepository userRepository;
    @Override
    public void addUser(UserDto userDto) {
        User user=new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);

    }

    @Override
    public void UpdateUser(UserDto userDto) {
    User user =userRepository.findById(userDto.getId()).get();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
    }

    @Override
    public List<UserDto> getAllUser() {
        return userRepository.getAllUser();
    }

    @Override
    public void deleteUser(long id) {
    userRepository.deleteById(id);
    }
}
