package com.example.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.CarDetailsVO;
@Repository
public interface CarRepo extends JpaRepository<CarDetailsVO, Integer> {

}
