package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mary = new Student("Mary Alex", "mary.lala@gmail.com",
                    LocalDate.of(2006, Month.AUGUST, 5)
            );
            Student booke = new Student(2L, "Samantha Booke", "smanatha@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 11)
            );
            repository.saveAll(List.of(mary, booke));
        };
    }
}
