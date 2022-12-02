package model;


import java.util.ArrayList;

public class Group {
    ArrayList<Teams> Teams;

    String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Group(String name) {
        this.name = name;
    }
}

