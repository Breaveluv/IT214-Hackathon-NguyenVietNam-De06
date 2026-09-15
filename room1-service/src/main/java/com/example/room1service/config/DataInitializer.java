package com.example.room1service.config;

import com.example.room1service.entity.Room;
import com.example.room1service.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RoomRepository roomRepository;

    @Override
    public void run(String... args) {
        if (roomRepository.count() == 0) {
            roomRepository.saveAll(List.of(
                    new Room("R101", "RT01", "101", "AVAILABLE"),
                    new Room("R102", "RT02", "102", "AVAILABLE"),
                    new Room("R201", "RT03", "201", "OCCUPIED")
            ));
        }
    }
}
