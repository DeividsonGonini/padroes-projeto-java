package br.com.cod3r.builder.meal.functional.model;

public class FastFoodMeal {

    private final String drink;
    private final String main;
    private final String side;
    private final String dessert;
    private final String gift;

    public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
        this.gift = gift;
    }

    /*
    Apenas Getters
     */

    public String getDrink() {
        return drink;
    }

    public String getMain() {
        return main;
    }

    public String getSide() {
        return side;
    }

    public String getDessert() {
        return dessert;
    }

    public String getGift() {
        return gift;
    }

    @Override
    public String toString() {
        return "FastFoodMeal{" +
                "drink='" + drink + '\'' +
                ", main='" + main + '\'' +
                ", side='" + side + '\'' +
                ", dessert='" + dessert + '\'' +
                ", gift='" + gift + '\'' +
                '}';
    }

    public static class Builder{
        //Mandatorio
        private String side;

        //Opcional
        private String drink;
        private String main;
        private String dessert;
        private String gift;

        //Criando Builder com o atributo obrigatorio (Caso desejar)
        public Builder(String side){
            this.side = side;
        }

        public Builder getDring(String drink){
            this.drink = drink;
            return this;
        }

        public Builder getMain(String main){
            this.main = main;
            return this;
        }

        public Builder getDessert(String dessert){
            this.dessert = dessert;
            return this;
        }

        public Builder getGift(String gift){
            this.gift = gift;
            return this;
        }

        //Criando a model com os atributos finais
        public FastFoodMeal build(){
            return new FastFoodMeal(drink, main, side, dessert, gift);
        }

    }


}
