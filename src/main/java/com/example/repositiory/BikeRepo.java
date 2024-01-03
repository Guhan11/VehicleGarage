package com.example.repositiory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.BikeDetailsVO;
@Repository
public interface BikeRepo extends JpaRepository<BikeDetailsVO, Integer> {

}
