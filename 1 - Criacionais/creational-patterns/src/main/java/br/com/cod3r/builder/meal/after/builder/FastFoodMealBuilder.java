package br.com.cod3r.builder.meal.after.builder;

import br.com.cod3r.builder.meal.after.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
    //Instancia do Dominio
    protected FastFoodMeal refeicao;

    public FastFoodMealBuilder() {
        refeicao = new FastFoodMeal();
    }

    public FastFoodMeal getRefeicao() {
        return refeicao;
    }

    /*
    Metodos para criar os atributos do Domain
    Por serem abstract todos se tornam de implementação obrigatoria
     */
    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildSide();
    public abstract void buildDessert();
    public abstract void buildGift();
}
