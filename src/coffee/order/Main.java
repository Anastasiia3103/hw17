package coffee.order;

public class Main {
    public static void main (String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard ();
        Order order1 = new Order ("Lesha");
        coffeeOrderBoard.add(order1);
        Order order2 = new Order ("Sasha");
        coffeeOrderBoard.add(order2);
        Order order3 = new Order ("Nastya");
        coffeeOrderBoard.add (order3);
        Order order4 = new Order ("Angelina");
        coffeeOrderBoard.add (order4);
        coffeeOrderBoard.draw ();
        coffeeOrderBoard.deliver ();
        coffeeOrderBoard.deliver (3);
        coffeeOrderBoard.draw ();
    }
}


