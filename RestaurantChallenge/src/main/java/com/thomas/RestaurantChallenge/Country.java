package com.thomas.RestaurantChallenge;

public class Country {


    public Country(String name, int id) {
        this.countryName = name;
        this.countryId = id;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", countryId='" + countryId + '\'' +
                '}';
    }

    private String countryName;
    private int countryId;
}
