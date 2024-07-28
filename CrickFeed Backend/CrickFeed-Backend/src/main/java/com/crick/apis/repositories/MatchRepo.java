package com.crick.apis.repositories;
//This Repo is created to access the database

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

//We are using interface here because we can keep it loosely coupled to change in future
public interface MatchRepo extends JpaRepository<Match,Integer> {

//    We want to fetch the Match here
//      If we provide teamHeading here it can fetch that match from it
    Optional<Match> findByTeamHeading(String teamHeading);


}
