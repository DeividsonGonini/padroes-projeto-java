package br.com.cod3r.builder.meal.after.builder;

public class ApenasFritasBuilder extends FastFoodMealBuilder{
    @Override
    public void buildDrink() {
        //não acompanha
    }

    @Override
    public void buildMain() {
        //não acompanha
    }

    @Override
    public void buildSide() {
        refeicao.setSide("Batata frita");
    }

    @Override
    public void buildDessert() {
        //não acompanha
    }

    @Override
    public void buildGift() {
        //não acompanha
    }
}
