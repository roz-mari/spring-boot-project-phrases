package com.example.Spring.boot.project.services;


import com.example.Spring.boot.project.models.Phrase;
import com.example.Spring.boot.project.repository.PhraseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhraseService{
    private final PhraseRepository phraseRepository;

    public PhraseService(PhraseRepository phraseRepository) {
        this.phraseRepository = phraseRepository;
    }
    public List<Phrase> getAllPhrases() {
        return phraseRepository.findAll();
    }

    public Optional<Phrase> getPhraseById(Long id) {
            return phraseRepository.findById(id);
    }

    public Phrase addPhrase(Phrase phrase) {
            return phraseRepository.save(phrase);
    }
    }