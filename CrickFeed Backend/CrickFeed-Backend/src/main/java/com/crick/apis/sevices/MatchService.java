package com.crick.apis.sevices;

import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

//We are using interface here because we can keep it loosely coupled to change in future
public interface MatchService {
//    get all matches

    List<Match> getAllMatches();

//    get live matches
    List<Match> getLiveMatches();

//    get points table
    List<List<String>>getPointTable();
}
