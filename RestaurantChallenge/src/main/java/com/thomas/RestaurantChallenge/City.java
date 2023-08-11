package com.thomas.RestaurantChallenge;

public class City {
    public City(String name, int id) {
        this.cityName = name;
        this.cityId = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + cityName + '\'' +
                ", countryId='" + cityId + '\'' +
                '}';
    }

    private String cityName;
    private int cityId;
}
