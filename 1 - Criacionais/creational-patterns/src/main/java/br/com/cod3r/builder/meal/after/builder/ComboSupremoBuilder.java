package br.com.cod3r.builder.meal.after.builder;

public class ComboSupremoBuilder extends FastFoodMealBuilder {

    /*
    Setar os valores desejados para esse combo
    Caso o combo não contenha algum item, apenas deixo o metodo em branco
     */
    @Override
    public void buildDrink() {
        refeicao.setDrink("MilkShake");
    }

    @Override
    public void buildMain() {
        refeicao.setMain("Triplo Cheddar Bacon Burguer");
    }

    @Override
    public void buildSide() {
        refeicao.setSide("Onion Rings");
    }

    @Override
    public void buildDessert() {
        refeicao.setDessert("Balde de Sorvete");
    }

    @Override
    public void buildGift() {
        refeicao.setToy("Boneco DC Comics");
    }
}
