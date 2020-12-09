/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;

/**
 *
 * @author Yates
 */
public class BeerExpert {
    public List getBrands(String color){
        List brands = new ArrayList();
        
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else if(color.equals("dark")){
            brands.add("Grey Goose");
            brands.add("Midnight Ale");
        }
        else if (color.equals("brown")) {
            brands.add("Murky Water");
            brands.add("Kinda Eh");
        }
        else {
            brands.add("Jail Pales Ale");
            brands.add("Gout Stout");
        }
        
        return(brands);
    }
}
