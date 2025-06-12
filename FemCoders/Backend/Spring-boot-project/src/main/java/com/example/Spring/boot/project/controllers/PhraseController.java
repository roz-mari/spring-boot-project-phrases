package com.example.Spring.boot.project.controllers;

import com.example.Spring.boot.project.models.Phrase;
import com.example.Spring.boot.project.services.PhraseService;
//import com.example.Spring.boot.project.repository.PhraseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phrases")
public class PhraseController {
    private final PhraseService phraseService;

    public PhraseController(PhraseService phraseService) {
        this.phraseService = phraseService;
    }
    @GetMapping("")
    public ResponseEntity<List<Phrase>> getAllPhrases() {
        List<Phrase> phrases = phraseService.getAllPhrases();
        return new ResponseEntity <List<Phrase>>(phrases, HttpStatus.OK);
        //return phraseRepository.getAllPhrase();
    }

    @PostMapping ("")
    public ResponseEntity<Phrase> addPhrases(@RequestBody Phrase newPhrase) {
       Phrase createdPhrase = phraseService.addPhrase(newPhrase);
       return new ResponseEntity<Phrase>(createdPhrase, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Phrase> getPhraseById(@PathVariable Long id) {
        return phraseService.getPhraseById(id)
                .map(phrase -> new ResponseEntity<>(phrase, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Phrase> updatePhrase(@PathVariable Long id, @RequestBody Phrase phraseDetails) {
        Phrase updatedPhrase = phraseService.updatePhrase(id, phraseDetails);
        return new ResponseEntity<>(updatedPhrase, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePhrase(@PathVariable Long id) {
        phraseService.deletePhrase(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


