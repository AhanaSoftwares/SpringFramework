package com.ahanasoftwares.pizza.factory;

public class PizzaApp {

	public static void main(String[] args) {
		 BasePizzaFactory pizzaFactory = new PizzaFactory();
	        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
	        Pizza veggiePizza = pizzaFactory.createPizza("veggie");

	}

}
