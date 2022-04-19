package com.company;
import java.util.List;
import java.util.ArrayList;

public class State {

    private String name;
    private List<City> cityList = new ArrayList<> ();

    public State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public void addCity(City city) {
        cityList.add(city);
    }

    public void deleteCity(City city) {
        cityList.remove(city);
    }
}