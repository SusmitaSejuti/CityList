package com.example.citylist;

public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
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
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

   /* public void delete(City city) {
        if (!cities.contains(city))
        {throw new IllegalArgumentException();}
        else {
            cities.remove(city);
        }
    }*/


}