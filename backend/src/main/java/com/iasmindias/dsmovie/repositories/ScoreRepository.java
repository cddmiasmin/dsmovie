package com.iasmindias.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iasmindias.dsmovie.entities.Score;
import com.iasmindias.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
