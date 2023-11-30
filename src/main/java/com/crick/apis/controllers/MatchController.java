package com.crick.apis.controllers;

import com.crick.apis.models.Match;
import com.crick.apis.services.impl.MatchServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
    private MatchServiceImpl matchService;
    public MatchController(MatchServiceImpl matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches() {
        return new ResponseEntity<>(matchService.getLiveMatches(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<>(matchService.getAllMatches(),HttpStatus.OK);
    }

    @GetMapping("/point-table")
    public ResponseEntity<List<List<String>>> getPointTable() {
        return new ResponseEntity<>(matchService.getPointTable(),HttpStatus.OK);
    }
}
