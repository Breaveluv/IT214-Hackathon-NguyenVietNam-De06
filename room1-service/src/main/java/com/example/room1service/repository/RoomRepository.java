package com.example.room1service.repository;

import com.example.room1service.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RoomRepository extends JpaRepository<Room, String> {
}
