package com.example.Spring.boot.project.repository;

import com.example.Spring.boot.project.models.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface PhraseRepository extends JpaRepository<Phrase, Long> {

    }

