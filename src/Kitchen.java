import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private List<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    public void prepareOrder(Order order) {
        notifyObservers("Order preparing");
    }
}