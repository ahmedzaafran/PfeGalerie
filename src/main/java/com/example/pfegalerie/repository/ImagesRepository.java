package com.example.pfegalerie.repository;


import com.example.pfegalerie.entity.Images;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ImagesRepository extends CrudRepository<Images,Long> {
}
