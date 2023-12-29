package com.example.pfegalerie.controller;

import com.example.pfegalerie.interfaces.UserInterface;
import com.example.pfegalerie.modelDto.UserDto;
import com.example.pfegalerie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.UserDataHandler;

import java.util.List;

@CrossOrigin(origins={"http://localhost:4200"} )
@RequestMapping(value = "/User")
@RestController
public class UserController {

    @Autowired
    UserInterface userInterface;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public void addUser(@RequestBody UserDto userDto) {
        userInterface.addUser(userDto);
    }
    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public void ModifierFile(@RequestBody UserDto userDto)  {
        userInterface.UpdateUser(userDto);
    }
    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public void deleteGroup(@RequestParam("id") long id) {
        userInterface.deleteUser(id);
    }
    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public List<UserDto> getGroups() {
        return userInterface.getAllUser();
    }
}
