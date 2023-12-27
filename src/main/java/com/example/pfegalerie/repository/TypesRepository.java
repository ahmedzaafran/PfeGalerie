package com.example.pfegalerie.repository;

import com.example.pfegalerie.entity.Types;
import com.example.pfegalerie.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypesRepository extends CrudRepository<Types,Long> {
}
