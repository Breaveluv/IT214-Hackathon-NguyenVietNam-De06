package com.example.roomtypeservice.controller;

import com.example.roomtypeservice.entity.RoomType;
import com.example.roomtypeservice.service.RoomTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoomTypeController {

    private final RoomTypeService roomTypeService;

    @GetMapping({"/api/roomtypes/{id}", "/roomtype/{id}"})
    public ResponseEntity<?> getRoomTypeById(@PathVariable("id") String id) {
        return roomTypeService.getRoomTypeById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Không tìm thấy loại phòng với ID: " + id));
    }

    @GetMapping({"/api/roomtypes", "/roomtype"})
    public ResponseEntity<List<RoomType>> getAllRoomTypes() {
        return ResponseEntity.ok(roomTypeService.getAllRoomTypes());
    }

    @PostMapping({"/api/roomtypes", "/roomtype"})
    public ResponseEntity<RoomType> createRoomType(@RequestBody RoomType roomType) {
        RoomType saved = roomTypeService.saveRoomType(roomType);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
