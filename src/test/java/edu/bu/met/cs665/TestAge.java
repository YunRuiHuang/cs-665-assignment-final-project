package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import edu.bu.met.cs665.finalProject.*;


/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAge {

    @Test
    public void testBuildPizza() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder(new ThickCrustDough());
        Pizza pizza = pizzaBuilder.build();
        assertEquals("This pizza bake with Thick Crust Dough", pizza.toString());

    }

    @Test
    public void testAllParam() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder(new ThickCrustDough());
        pizzaBuilder.setCheese(new MozzarellaCheese());
        pizzaBuilder.setSauce(new TomatoSauce());
        pizzaBuilder.setVeggies(new Garlic());
        pizzaBuilder.setMeat(new Clam());
        Pizza pizza = pizzaBuilder.build();
        assertEquals("This pizza bake with Thick Crust Dough, Mozzarella Cheese, Garlic, Tomato Sauce, Clam", pizza.toString());

    }

    @Test
    public void testChangeParam() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder(new ThickCrustDough());
        Pizza pizza = pizzaBuilder.build();
        assertEquals("This pizza bake with Thick Crust Dough", pizza.toString());
        pizzaBuilder.setDough(new ThinCrustDough());
        pizza = pizzaBuilder.build();
        assertEquals("This pizza bake with Thin Crust Dough", pizza.toString());

    }


}
