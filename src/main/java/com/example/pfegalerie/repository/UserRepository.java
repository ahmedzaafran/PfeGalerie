package com.example.pfegalerie.repository;

import com.example.pfegalerie.entity.User;
import com.example.pfegalerie.modelDto.UserDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    @Query("select new com.example.pfegalerie.modelDto.UserDto (u.id,u.name,u.password,u.email) from User u")
    List<UserDto> getAllUser();
}
