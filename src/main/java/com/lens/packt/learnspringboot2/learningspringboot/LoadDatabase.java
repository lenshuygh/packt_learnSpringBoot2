package com.lens.packt.learnspringboot2.learningspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init(ChapterRepository repository) {
        return args -> {
            Flux.just(
                    new Chapter("Thor"),
                    new Chapter("...was fuckin' "),
                    new Chapter("awesome!"))
                    .flatMap(repository::save)
                    .subscribe(System.out::println);
        };
    }
}
