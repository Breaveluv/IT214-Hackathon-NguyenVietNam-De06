package com.example.roomtypeservice.config;

import com.example.roomtypeservice.entity.RoomType;
import com.example.roomtypeservice.repository.RoomTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RoomTypeRepository roomTypeRepository;

    @Override
    public void run(String... args) {
        if (roomTypeRepository.count() == 0) {
            roomTypeRepository.saveAll(List.of(
                    new RoomType("RT01", "Standard Room", 100.0),
                    new RoomType("RT02", "Deluxe Room", 200.0),
                    new RoomType("RT03", "VIP Suite", 350.0)
            ));
        }
    }
}
