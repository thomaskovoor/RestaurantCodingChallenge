package com.thomas.RestaurantChallenge;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="CityList")
public class cityDetails {

@Column(name="City_Id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getCityName() {
    return cityName;
}
public void setCityName(String cityName) {
    this.cityName = cityName;
}

@Column(name="City_Name")
private String cityName;    


public cityDetails(){
    super();
}
}
