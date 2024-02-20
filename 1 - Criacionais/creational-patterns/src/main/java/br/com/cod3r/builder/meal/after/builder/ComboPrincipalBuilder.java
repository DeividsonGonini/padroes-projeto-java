package br.com.cod3r.builder.meal.after.builder;

public class ComboPrincipalBuilder extends FastFoodMealBuilder{
    @Override
    public void buildDrink() {
        refeicao.setDrink("Coca-Cola");
    }

    @Override
    public void buildMain() {
        refeicao.setMain("X-Burger");
    }

    @Override
    public void buildSide() {
        refeicao.setSide("Fritas");
    }

    @Override
    public void buildDessert() {
        refeicao.setDessert("Maçã");
    }

    @Override
    public void buildGift() {
        refeicao.setSide("Boneco Vingadores");
    }
}
