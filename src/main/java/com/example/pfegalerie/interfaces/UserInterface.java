package com.example.pfegalerie.interfaces;

import com.example.pfegalerie.modelDto.UserDto;

import java.util.List;

public interface UserInterface {
    void addUser(UserDto userDto) ;
    void UpdateUser(UserDto userDto) ;
    List<UserDto> getAllUser();
    void deleteUser(long id);

}
