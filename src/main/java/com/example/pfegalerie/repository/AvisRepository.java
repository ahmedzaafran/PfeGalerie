package com.example.pfegalerie.repository;

import com.example.pfegalerie.entity.Avis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvisRepository extends CrudRepository<Avis,Long> {
}
