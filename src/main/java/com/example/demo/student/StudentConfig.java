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
    CommandLineRunner commandLineRunner (StudentRepository studentRepository){
        return args -> {
            Student ismail = new Student(
                    "Ismail",
                    "ismail@gmail.com",
                    LocalDate.of(1993, Month.OCTOBER, 29));

            Student chaimaa = new Student(
                    "Chaimaa",
                    "Chaimaa@gmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 8));

            studentRepository.saveAll(List.of(ismail, chaimaa));

        };
    }
}
