package com.example.java_final_assessment.Lottery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lotto")
public class LotteryController {

    private LotteryService lotteryService;

    public LotteryController (LotteryService lotteryService) {
        this.lotteryService = lotteryService;
    }

    //----------------------------------------------------------
    // Get


    // Post

    // Put

    // Delete

}
