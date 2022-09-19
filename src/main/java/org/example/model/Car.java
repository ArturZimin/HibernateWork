package org.example.model;

import javax.persistence.*;

@Entity
@Table (name="cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//auto_increment
    @Column(name="id")//имя колонки
    private Integer id;

    @Column(name = "car_brand")
    private String brand;
    @Column(name = "version")
    private String version;
    @Column(name = "count_door")
    private Integer countDoor;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "id")//на какое поле присоединяется
    private User userCar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getCountDoor() {
        return countDoor;
    }

    public void setCountDoor(Integer countDoor) {
        this.countDoor = countDoor;
    }

    public User getUser() {
        return userCar;
    }

    public void setUser(User user) {
        this.userCar = user;
    }
}
