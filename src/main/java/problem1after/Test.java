package problem1after;

public class Test {
    public static void main(String[] args) {
        Order order = new Order("SAFI Amal");

        CustomerSms sms = new CustomerSms();
        order.subscribe(sms);
        order.subscribe(new KitchenScreen());

        order.addDish(new Spicy(new Cheese(new Dish("Tacos", 45))));
        order.addCombo("Student menu",
                new MenuItem[] {
                        new Cheese(new Dish("Burger", 40)),
                        new Dish("Fries", 15),
                        new Dish("Soda", 10)
                }
        );
        order.print();

        order.pay();
        order.startPreparing();
        order.cancel();
        order.markReady();
        order.deliver();
        order.pay();
    }
}
