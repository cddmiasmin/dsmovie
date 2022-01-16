package com.iasmindias.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iasmindias.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long>{

}
