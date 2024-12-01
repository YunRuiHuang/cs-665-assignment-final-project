/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/01/2024
 * File Name: PizzaBuilder.java
 * Description: This class is responsible for the builder pattern to construct and configure a Pizza object step by step.
 */
package edu.bu.met.cs665.finalProject;

/**
 * This is the PizzaBuilder class.
 * This class is responsible for the builder pattern to construct and configure a Pizza object step by step.
 */
public class PizzaBuilder {
    private Cheese cheese;
    private Veggies veggies;
    private Sauce sauce;
    private Dough dough;
    private Meat meat;

    /**
     * Constructor for the PizzaBuilder. Requires a Dough object as a mandatory field.
     * @param dough The dough for the pizza (required component)
     */
    public PizzaBuilder(Dough dough){

        this.dough = dough;

        cheese = null;
        veggies = null;
        sauce = null;
        meat = null;
    }

    /**
     * Sets the cheese component for the pizza.
     * @param cheese The cheese to be added to the pizza
     */
    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    /**
     * Sets the veggies component for the pizza.
     * @param veggies The cheese to be added to the pizza
     */
    public void setVeggies(Veggies veggies) {
        this.veggies = veggies;
    }

    /**
     * Sets the sauce component for the pizza.
     * @param sauce The cheese to be added to the pizza
     */
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    /**
     * Sets the dough component for the pizza.
     * @param dough The cheese to be added to the pizza
     */
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    /**
     * Sets the meat component for the pizza.
     * @param meat The cheese to be added to the pizza
     */
    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    /**
     * Gets the cheese component of the pizza.
     * @return The cheese of the pizza
     */
    public Cheese getCheese() {
        return cheese;
    }

    /**
     * Gets the veggies component of the pizza.
     * @return The veggies of the pizza
     */
    public Veggies getVeggies() {
        return veggies;
    }

    /**
     * Gets the sauce component of the pizza.
     * @return The sauce of the pizza
     */
    public Sauce getSauce() {
        return sauce;
    }

    /**
     * Gets the dough component of the pizza.
     * @return The dough of the pizza
     */
    public Dough getDough() {
        return dough;
    }

    /**
     * Gets the meat component of the pizza.
     * @return The meat of the pizza
     */
    public Meat getMeat() {
        return meat;
    }

    /**
     * Builds and returns a Pizza object using the components set in the builder.
     * @return A fully constructed Pizza object
     */
    public Pizza build(){
        return new Pizza(this);
    }
}