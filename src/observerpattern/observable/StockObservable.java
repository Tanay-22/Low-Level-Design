package observerpattern.observable;

import observerpattern.observer.NotificationAlertObserver;

public interface StockObservable
{
    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockAdded);

    int getStockCount();
}
