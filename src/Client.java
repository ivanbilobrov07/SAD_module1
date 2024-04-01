public class Client implements Observer {
    public Cart cart;

    public Client(Cart cart){
        this.cart = cart;
    }

    public void update(String message) {
        System.out.println("Client received a message: " + message);
    }
}
