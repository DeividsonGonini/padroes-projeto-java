package br.com.cod3r.builder.meal.after.director;

import br.com.cod3r.builder.meal.after.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.after.model.FastFoodMeal;

public class MealDirector {

    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    //Construindo o objeto
    public void construtorCombo(){
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    //Devolve o objeto
    public FastFoodMeal getCombo(){
        return builder.getRefeicao();
    }
}
