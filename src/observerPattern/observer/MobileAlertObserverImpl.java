package observerPattern.observer;

import observerPattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver
{
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable)
    {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update()
    {
        sendMsgOnMobile(userName, "Product is in stock, Hurry up!!");
    }

    private void sendMsgOnMobile(String userName, String msg)
    {
        System.out.println("Message sent to: " + userName);
    }
}
