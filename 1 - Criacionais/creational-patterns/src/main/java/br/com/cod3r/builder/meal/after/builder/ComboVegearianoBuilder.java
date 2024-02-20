package br.com.cod3r.builder.meal.after.builder;

public class ComboVegearianoBuilder extends FastFoodMealBuilder{

    @Override
    public void buildDrink() {
        refeicao.setDrink("Agua");
    }

    @Override
    public void buildMain() {
        refeicao.setMain("Hamburger Vegeteriano");
    }

    @Override
    public void buildSide() {
        refeicao.setSide("Salada");
    }

    @Override
    public void buildDessert() {
        refeicao.setDessert("Maça");
    }

    @Override
    public void buildGift() {
        refeicao.setToy("Adesivo Vegetariano");
    }
}
