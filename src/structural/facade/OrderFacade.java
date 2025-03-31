package structural.facade;

public class OrderFacade
{
    ProductDAO productDAO;
    Invoice invoice;
    SendNotification notification;
    Payment payment;

    public OrderFacade()
    {
        productDAO = new ProductDAO();
        invoice = new Invoice();
        payment = new Payment();
        notification = new SendNotification();
    }

    public void createOrder()
    {
        Product product = productDAO.getProduct(121);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
        // order creation successful
    }
}
