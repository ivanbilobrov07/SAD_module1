public interface ObserverSubject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String message);
}
