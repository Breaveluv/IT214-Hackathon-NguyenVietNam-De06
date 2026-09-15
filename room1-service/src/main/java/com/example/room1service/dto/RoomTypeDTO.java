package com.example.room1service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomTypeDTO {
    private String roomTypeId;
    private String roomTypeName;
    private Double price;
}
