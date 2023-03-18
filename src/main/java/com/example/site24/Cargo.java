package com.example.site24;//1-й класс

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Cargo {
    public long id;//id

    public String name_;//вид техники
    public String inside;//тип техники
    public String city_first;//Дата ввоза на склад
    public String city_last;//Дата вывоза со склада
    public String date_first;//Дата вывоза со склада
    public String data_last;//Дата вывоза со склада


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }

    public String getDate_first() {
        return date_first;
    }

    public void setDate_first(String date_first) {
        this.date_first = date_first;
    }

    public String getData_last() {
        return data_last;
    }

    public void setData_last(String date_last) {
        this.data_last = date_last;
    }

    public String getCity_first() {
        return city_first;
    }

    public void setCity_first(String city_first) {
        this.city_first = city_first;
    }

    public String getCity_last() {
        return city_last;
    }

    public void setCity_last(String city_last) {
        this.city_last = city_last;
    }

}

