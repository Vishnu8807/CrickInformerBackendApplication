package com.crick.apis.repositories;

import com.crick.apis.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchRepo extends JpaRepository<Match,Integer> {
    //To fetch match details with teamHeading
    Optional<Match> findByTeamHeading(String teamHeading);

}
