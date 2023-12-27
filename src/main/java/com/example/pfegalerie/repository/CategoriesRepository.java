package com.example.pfegalerie.repository;

import com.example.pfegalerie.entity.Categories;
import com.example.pfegalerie.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories,Long> {
}
