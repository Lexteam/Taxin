package xyz.lexteam.taxin.economy;

import java.util.List;

public class Product{
    String name;


    public class Part{
        double value;
    }

    List<Part> Parts;

    public double getValue(){
        double value = 0;
        for(Part part : Parts){
            value += part.value;
        }
        return value;
    }

}


