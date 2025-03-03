package observerPattern;

import observerPattern.observable.IphoneObservableImpl;
import observerPattern.observable.StockObservable;
import observerPattern.observer.EmailAlertObserverImpl;
import observerPattern.observer.MobileAlertObserverImpl;
import observerPattern.observer.NotificationAlertObserver;

public class Store
{
    public static void main(String[] args)
    {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@xyz", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("def@pqr", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("Dogesh", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
