/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/01/2024
 * File Name: Pizza.java
 * Description: This class is responsible for the Pizza object.
 */
package edu.bu.met.cs665.finalProject;

/**
 * This is the Pizza class.
 * This class is responsible for representing a Pizza.
 */
public class Pizza {
    private final Cheese cheese;
    private final Veggies veggies;
    private final Sauce sauce;
    private final Dough dough;
    private final Meat meat;

    /**
     * Constructor for creating a Pizza instance from a PizzaBuilder object
     * @param pizzaBuilder The PizzaBuilder instance used to construct the Pizza
     */
    public Pizza(PizzaBuilder pizzaBuilder){
        cheese = pizzaBuilder.getCheese();
        veggies = pizzaBuilder.getVeggies();
        sauce = pizzaBuilder.getSauce();
        dough = pizzaBuilder.getDough();
        meat = pizzaBuilder.getMeat();
    }

    /**
     * Overrides the toString method to describe the components of the Pizza
     * @return A string describing all the components of the Pizza
     */
    @Override
    public String toString() {
        String output = "This pizza bake with " + dough.toString();
        if (cheese != null){
            output += ", " + cheese.toString();
        }
        if (veggies != null){
            output += ", " + veggies.toString();
        }
        if (sauce != null){
            output += ", " + sauce.toString();
        }
        if (meat != null){
            output += ", " + meat.toString();
        }
        return output;
    }
}
