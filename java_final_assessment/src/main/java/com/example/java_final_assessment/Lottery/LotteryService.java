package com.example.java_final_assessment.Lottery;

import org.springframework.stereotype.Service;

@Service
public class LotteryService {
    private final LotteryRepository lotteryRepository;

    public LotteryService(LotteryRepository lotteryRepository) {
        this.lotteryRepository = lotteryRepository;
    }

    // Get All List

    // Get Specific ID Of Lottery

    // Create Lottery

    // Change Lottery

    // Delete Lottery (Return)

    // Calculate the previous purchases
}
