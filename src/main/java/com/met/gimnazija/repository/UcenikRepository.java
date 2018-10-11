package com.met.gimnazija.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.met.gimnazija.entities.Ucenik;

@Repository
public interface UcenikRepository extends CrudRepository<Ucenik, Integer>{

}
