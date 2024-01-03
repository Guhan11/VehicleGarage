package com.example.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.MyDetailsVO;
@Repository

public interface DetailsRepo extends JpaRepository<MyDetailsVO, Integer> {

}
