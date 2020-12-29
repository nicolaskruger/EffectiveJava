package Pizzaria;

public class main {
    public static void main(String[] args) {
        MyPizza pizza = new MyPizza.Builder(MyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION)
                .build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM).sauceInside().build();
        System.out.println();
    }
}
