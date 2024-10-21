package com.example.lab8;

import java.util.Objects;

public class City {

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public boolean equals(Object city) {
        if (this == city) {
            return true;
        }

        if (city == null || getClass() != city.getClass()) {
            return false;
        }

        City city1 = (City) city;
        return Objects.equals(this.city, city1.getCityName())
                && Objects.equals(this.province, city1.getProvinceName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
