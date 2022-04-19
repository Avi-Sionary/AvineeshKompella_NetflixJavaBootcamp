package com.company;

public class App {

    public static void addState(ArrayList<State> stateList, State s) {
        stateList.add(s);
    }

    public static void deleteState(ArrayList<State> stateList, State s) {
        stateList.remove(s);
    }

    public static void searchStateByName(ArrayList<State> stateList, String name) {

    }

    public static void searchLessThanPop(ArrayList<State> stateList, int pop) {

    }

    public static void searchMoreThanPop(ArrayList<State> stateList, int pop) {

    }

    public static void searchCityInState(State s, String name) {

    }

    public static void searchLessThanPopForState(State s, int pop) {

    }

    public static void searchMoreThanPopForState(State s, int pop) {

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

    }

}