package com.example.room1service.client;

import com.example.room1service.dto.RoomTypeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "roomtype-service")
public interface RoomTypeClient {

    @GetMapping("/api/roomtypes/{id}")
    RoomTypeDTO getRoomTypeById(@PathVariable("id") String id);
}
