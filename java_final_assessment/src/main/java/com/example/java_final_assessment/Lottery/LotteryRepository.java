package com.example.java_final_assessment.Lottery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotteryRepository extends JpaRepository<Lottery, Integer> {

    // Query in SQL Here
}
