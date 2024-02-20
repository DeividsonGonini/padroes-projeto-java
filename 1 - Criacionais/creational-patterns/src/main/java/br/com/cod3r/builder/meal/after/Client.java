package br.com.cod3r.builder.meal.after;

import br.com.cod3r.builder.meal.after.builder.*;
import br.com.cod3r.builder.meal.after.director.MealDirector;

public class Client {
	public static void order(String nome, FastFoodMealBuilder builder){
		System.out.println("Pedindo um " + nome);
		MealDirector director = new MealDirector(builder);
		director.construtorCombo();
		System.out.println(director.getCombo());

		System.out.println("--------------------");
	}

	public static void main(String[] args) {
		order("Burguer", new ComboPrincipalBuilder());
		order("Hamburguer Vegetariano", new ComboVegearianoBuilder());
		order("Apenas Fritas", new ApenasFritasBuilder());
		order("Combo Supremo", new ComboSupremoBuilder());
	}
}