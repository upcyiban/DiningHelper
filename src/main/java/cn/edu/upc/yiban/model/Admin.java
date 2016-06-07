package cn.edu.upc.yiban.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

/**
 * Created by 77dfeba on 2016/6/7.
 */
@Entity
@Table(name = "dininghelper")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int hall;
    private int floor;
    private int window;
    private String dishes;
    private String details;

    public Admin(String details, String dishes, int floor, int hall, int window) {
        this.details = details;
        this.dishes = dishes;
        this.floor = floor;
        this.hall = hall;
        this.window = window;
    }

    public String getDetails() {
        return details;
    }

    public String getDishes() {
        return dishes;
    }

    public int getFloor() {
        return floor;
    }

    public int getHall() {
        return hall;
    }

    public int getId() {
        return id;
    }

    public int getWindow() {
        return window;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setHall(int hall) {
        this.hall = hall;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWindow(int window) {
        this.window = window;
    }
}
