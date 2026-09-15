package com.example.roomtypeservice.repository;

import com.example.roomtypeservice.entity.RoomType;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, String> {

}
