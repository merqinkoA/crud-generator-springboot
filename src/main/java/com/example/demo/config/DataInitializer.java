package com.example.demo.config;

import com.example.demo.model.Qinko;
import com.example.demo.repository.QinkoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initDatabase(@Autowired QinkoRepository qinkoRepository) {
        return args -> {
            // Create and save sample Qinko entities
            Qinko qinko1 = new Qinko();
            qinko1.setName("Sample Qinko 1");
            qinko1.setEmail("qinko1@example.com");
            qinko1.setPhone("123-456-7890");
            qinkoRepository.save(qinko1);

            Qinko qinko2 = new Qinko();
            qinko2.setName("Sample Qinko 2");
            qinko2.setEmail("qinko2@example.com");
            qinko2.setPhone("987-654-3210");
            qinkoRepository.save(qinko2);

            System.out.println("Sample data initialized successfully");
        };
    }
}
