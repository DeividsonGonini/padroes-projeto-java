package br.com.cod3r.builder.meal.functional;


import br.com.cod3r.builder.meal.functional.model.FastFoodMeal;

public class Client {
	
	public static void main(String[] args) {
		FastFoodMeal burguerCombo = new FastFoodMeal.Builder("Fritas")
				.getMain("CheeseBurguer")
				.getDring("Refrigerante")
				.build();
		System.out.println(burguerCombo);

		FastFoodMeal apenasBatatas = new FastFoodMeal.Builder("Fritas")
				.build();
		System.out.println(apenasBatatas);


		FastFoodMeal comboAtaqueCoracao = new FastFoodMeal.Builder("Fritas")
				.getMain("Monster Burguer")
				.getDring("Milk Shake")
				.getDessert("Balde de Sorvete")
				.getGift("2Kg a mais")
				.build();
		System.out.println(comboAtaqueCoracao);
	}
}