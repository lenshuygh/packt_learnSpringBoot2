package com.lens.packt.learnspringboot2.learningspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {

    private final ChapterRepository repository;

    public ChapterController(ChapterRepository chapterRepository) {
        this.repository = chapterRepository;
    }

    @GetMapping("/Chapters")
    public Flux<Chapter> listing(){
        return repository.findAll();
    }
}


