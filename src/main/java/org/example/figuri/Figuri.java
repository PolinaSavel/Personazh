package org.example.figuri;

public class Figuri {

    String name;

    public String getName() {
        return name;
    }

    public String setName(String name){
        this.name=name;
        return name;
    }

    protected void displayName(String name){
        System.out.printf("Я фигура: %s\n"+ getName());
    }

}
