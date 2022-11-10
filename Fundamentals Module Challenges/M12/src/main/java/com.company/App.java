package com.company;
import java.util.List;
import java.util.ArrayList;

public class App {

    public static void addState(List<State> stateList, State s) { stateList.add(s); }

    public static void deleteState(List<State> stateList, State s) {
        stateList.remove(s);
    }

    public static void listStates(List<State> stateList) {

        for (int s = 0; s <= stateList.size() - 1; s++) {
            System.out.println(stateList.get(s).getName());
        }

    }

    public static void addCityToState(State s, City c) { s.addCity(c); }

    public static void deleteCityFromState(State s, String c) {

        for (City city: s.getCityList()) {

            if (city.getName() == c) {
                s.deleteCity(city);
                break;
            }
        }
    }

    public static void listCities(State s) {

        List<City> cities = s.getCityList();

        for (int c = 0; c <= cities.size() - 1; c++) {
            System.out.println(cities.get(c).getName());
        }

    }

    public static State searchStateByName(List<State> stateList, String name) {

        for (State s: stateList) {

            if (s.getName() == name) {
                System.out.println("Found: " + s.getName());
                return s;
            }

        }

        System.out.println("Error: State not found");
        return null;
    }

    public static List<State> searchLessThanPop(List<State> stateList, int pop) {

        List<State> states = new ArrayList<>();

        for (State s: stateList) {

            int total = 0;

            for (City c: s.getCityList()) {
                total += c.getPopulation();
            }

            if (total < pop) {
                states.add(s);
            }

        }

        return states;

    }

    public static List<State> searchMoreThanPop(List<State> stateList, int pop) {

        List<State> states = new ArrayList<>();

        for (State s: stateList) {

            int total = 0;

            for (City c: s.getCityList()) {
                total += c.getPopulation();
            }

            if (total >= pop) {
                states.add(s);
            }

        }

        return states;

    }

    public static City searchCityInState(State s, String name) {

        for (City c: s.getCityList()) {

            if (c.getName() == name) {
                System.out.println("Found in " + s.getName() + ": " + c.getName());
                return c;
            }

        }

        System.out.println("Error: City not found in " + s.getName());
        return null;
    }

    public static City getCapital(State s) {

        for (City c: s.getCityList()) {

            if (c.isCapital()) {
                System.out.println("The capital of " + s.getName() + " is " + c.getName());
                return c;
            }

        }

        System.out.println("Error: Capital for the state of " + s.getName() + " is not in the database.");
        return null;
    }

    public static List<City> searchLessThanPopForCity(State s, int pop) {

        List<City> cities = new ArrayList<>();

        for (City c: s.getCityList()) {

            if (c.getPopulation() < pop) {
                cities.add(c);
            }

        }

        return cities;

    }

    public static List<City> searchMoreThanPopForCity(State s, int pop) {

        List<City> cities = new ArrayList<>();

        for (City c: s.getCityList()) {

            if (c.getPopulation() >= pop) {
                cities.add(c);
            }

        }

        return cities;

    }

    public static void main(String[] args) {

        List<State> stateList = new ArrayList<>();

        State NY = new State("New York");
        City NYC = new City("New York City", 8654321, NY, false);
        NY.addCity(NYC);
        addState(stateList, NY);

        State CA = new State("California");
        City LA = new City("Los Angeles", 4563218, CA, false);
        CA.addCity(LA);
        addState(stateList, CA);

        State IL = new State("Illinois");
        City Chicago = new City("Chicago", 2716520, IL, false);
        IL.addCity(Chicago);
        addState(stateList, IL);

        State CO = new State("Colorado");
        City Denver = new City("Denver", 704621, CO, true);
        CO.addCity(Denver);
        addState(stateList, CO);

        State IA = new State("Iowa");
        City DesMoines = new City("Des Moines", 217521, IA, true);
        IA.addCity(DesMoines);
        addState(stateList, IA);

        State GA = new State("Georgia");
        City Atlanta = new City("Atlanta", 486213, GA, true);
        GA.addCity(Atlanta);
        addState(stateList, GA);

        listStates(stateList);

        deleteState(stateList, CO);

        System.out.println("----------");
        listStates(stateList);

        City SantaClarita = new City("Santa Clarita", 213411, CA, false);
        City Sacramento = new City("Sacramento", 500930, CA, true);
        addCityToState(CA, SantaClarita);
        addCityToState(CA, Sacramento);

        System.out.println("----------");
        System.out.println("Cities in California:");
        listCities(CA);

        deleteCityFromState(CA, "Santa Clarita");
        System.out.println("----------");
        System.out.println("Cities in California:");
        listCities(CA);

        System.out.println("----------");
        State stateName = searchStateByName(stateList, "New York");

        System.out.println("----------");
        State fakeName = searchStateByName(stateList, "Texas");

        System.out.println("----------");
        List<State> statesLessThan = searchLessThanPop(stateList, 1000000);
        listStates(statesLessThan);

        System.out.println("----------");
        List<State> statesMoreThan = searchMoreThanPop(stateList, 1000000);
        listStates(statesMoreThan);

        System.out.println("----------");
        City c = searchCityInState(CA, "Los Angeles");

        System.out.println("----------");
        City fakeCity = searchCityInState(CA, "Kablamville");

        System.out.println("----------");
        City capital = getCapital(CA);

        System.out.println("----------");
        City capital2 = getCapital(NY);

        System.out.println("----------");
        List<City> citiesLessThan = searchLessThanPopForCity(CA, 4500000);
        for (City citi: citiesLessThan) {
            System.out.println(citi.getName());
        }

        System.out.println("----------");
        List<City> citiesMoreThan = searchMoreThanPopForCity(CA, 4500000);
        for (City citi: citiesMoreThan) {
            System.out.println(citi.getName());
        }

    }

}