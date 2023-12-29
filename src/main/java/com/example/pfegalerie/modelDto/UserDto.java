package com.example.pfegalerie.modelDto;

import com.example.pfegalerie.enumeration.TypeUser;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String name;
    private String password;
    private String email;
    private TypeUser typeUser;

    public UserDto(Long id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
