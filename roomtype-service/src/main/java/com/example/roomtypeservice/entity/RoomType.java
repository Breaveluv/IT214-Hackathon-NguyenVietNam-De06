package com.example.roomtypeservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "room_types")
public class RoomType {
    @Id
    public String roomTypeId;
    public String roomTypeName;
    public Double price;
}
