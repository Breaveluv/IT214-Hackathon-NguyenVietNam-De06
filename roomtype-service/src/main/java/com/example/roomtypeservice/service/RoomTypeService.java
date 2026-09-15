package com.example.roomtypeservice.service;

import com.example.roomtypeservice.entity.RoomType;
import com.example.roomtypeservice.repository.RoomTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomTypeService {

    private final RoomTypeRepository roomTypeRepository;

    public Optional<RoomType> getRoomTypeById(String id) {
        return roomTypeRepository.findById(id);
    }

    public List<RoomType> getAllRoomTypes() {
        return roomTypeRepository.findAll();
    }

    public RoomType saveRoomType(RoomType roomType) {
        return roomTypeRepository.save(roomType);
    }
}
