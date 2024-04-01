import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private DeliveryStrategy deliveryMethod;

    public Order(List<Product> products, DeliveryStrategy deliveryMethod) {

        this.products = products;
        this.deliveryMethod = deliveryMethod;
    }

    public double getPrice() {
        double price = 0;

        for (Product product : products) {
            price += product.price;
        }

        return price + deliveryMethod.getPrice();
    }
}