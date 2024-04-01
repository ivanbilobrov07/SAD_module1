import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Waiter implements ObserverSubject {
    public String name;

    private List<Observer> observers = new ArrayList<>();

    public Waiter(String name) {
        this.name = name;
    }

    public Order takeOrder(Cart cart, DeliveryStrategy DS, Kitchen kitchen) {
        notifyObservers("Order processing");
        Order order = new Order(cart.products, DS);
        kitchen.prepareOrder(order);
        return order;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}