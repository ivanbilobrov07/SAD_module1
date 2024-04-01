//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Cart cart = new Cart();
        Client client = new Client(cart);
        Waiter waiter = new Waiter("Bob");

        cart.addProduct(new Product("Bread", 5));
        cart.addProduct(new Product("Water", 1));
        cart.addProduct(new Product("Salmon", 12));

        kitchen.addObserver(client);
        waiter.addObserver(client);

        client.cart.checkout();
        Order order = waiter.takeOrder(client.cart, new CourierStrategy(), kitchen);
        System.out.println(order.getPrice());
    }
}