package observerPattern.observable;

import observerPattern.observer.NotificationAlertObserver;

public interface StockObservable
{
    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockAdded);

    int getStockCount();
}
