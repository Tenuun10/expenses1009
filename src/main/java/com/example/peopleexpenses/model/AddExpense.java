package com.example.peopleexpenses.model;

public class AddExpense {

    private Integer id;
    private String place;
    private String amount;
    private String who;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    @Override
    public String toString() {
        return "AddExpense{" +
                "id=" + id +
                ", place='" + place + '\'' +
                ", amount='" + amount + '\'' +
                ", who='" + who + '\'' +
                '}';
    }
}
