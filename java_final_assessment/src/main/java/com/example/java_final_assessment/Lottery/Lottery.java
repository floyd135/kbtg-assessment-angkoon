package com.example.java_final_assessment.Lottery;

import jakarta.persistence.*;

@Entity
@Table(name = "lottery")
public class Lottery {

    //Constructors
    public Lottery() {}

    public Lottery(Integer id,String lottery_num, float price, Integer belong_to_cust) {
        this.id = id;
        this.lottery_num = lottery_num;
        this.price = price;
        this.belong_to_cust = belong_to_cust;
    }

    // Declaration of Variables
    // Primary Key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private Integer id;

    @Column(name = "ticket_number", length = 6)
    private String lottery_num;

    @Column(name = "price")
    private float price;

    @Column(name = "belong_to_cust")
    private Integer belong_to_cust;

    //----------------------------------------------------------

    //Getters
    public Integer getId() {
        return id;
    }

    public String getLottery_num() {
        return lottery_num;
    }

    public float getPrice() {
        return price;
    }

    public Integer getBelong_to_cust() {
        return belong_to_cust;
    }

    //----------------------------------------------------------

    //Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setLottery_num(String lottery_num) {
        this.lottery_num = lottery_num;
    }

    public void setBelong_to_cust(Integer belong_to_cust) {
        this.belong_to_cust = belong_to_cust;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
