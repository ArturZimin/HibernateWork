package org.example.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")//имя таблицы
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")//имя колонки
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private Double age;

    @OneToMany(mappedBy="user",cascade = CascadeType.ALL,orphanRemoval = true)//прямая связь (создает 3 таблицу и через ид связывает)
    private List<Car> cars;


    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
