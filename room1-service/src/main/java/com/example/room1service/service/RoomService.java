package com.example.room1service.service;

import com.example.room1service.client.RoomTypeClient;
import com.example.room1service.dto.RoomResponse;
import com.example.room1service.dto.RoomTypeDTO;
import com.example.room1service.entity.Room;
import com.example.room1service.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;
    private final RoomTypeClient roomTypeClient;

    public List<RoomResponse> getAllRooms() {
        return roomRepository.findAll().stream()
                .map(this::mapToRoomResponse)
                .collect(Collectors.toList());
    }

    private RoomResponse mapToRoomResponse(Room room) {
        RoomTypeDTO roomTypeDTO = null;
        try {
            if (room.getRoomTypeId() != null && !room.getRoomTypeId().trim().isEmpty()) {
                roomTypeDTO = roomTypeClient.getRoomTypeById(room.getRoomTypeId());
            }
        } catch (Exception e) {
            log.warn("Không thể lấy thông tin roomType từ roomtype-service qua Feign cho ID: {}. Lỗi: {}",
                    room.getRoomTypeId(), e.getMessage());
        }

        return RoomResponse.builder()
                .roomId(room.getRoomId())
                .roomNumber(room.getRoomNumber())
                .status(room.getStatus())
                .roomTypeId(room.getRoomTypeId())
                .roomTypeName(roomTypeDTO != null ? roomTypeDTO.getRoomTypeName() : null)
                .price(roomTypeDTO != null ? roomTypeDTO.getPrice() : null)
                .build();
    }
}
