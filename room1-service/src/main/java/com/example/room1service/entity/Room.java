package com.example.room1service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Builder
@Entity
@Table(name = "rooms")
public class Room {
    @Id
    private String roomId;
    private String roomTypeId;
    private String roomNumber;
    private String status;
}
