package carRentalSystem;

import java.time.Duration;

public class Bill
{
    private final Reservation reservation;
    private double totalBillAmount;
    private boolean isBillPaid;

    public Bill(Reservation reservation)
    {
        this.reservation = reservation;
        computeBillAmount();
    }

    public void computeBillAmount()
    {
        Duration duration = Duration.between(reservation.getBookedTill(), reservation.getBookedFrom());
        if(ReservationType.DAILY.equals(reservation.getReservationType()))
        {
            totalBillAmount = duration.toDays() * reservation.getVehicle().getDailyRentalCost();
        }
        else
        {
            totalBillAmount = duration.toHours() * reservation.getVehicle().getHourlyRentalCost();
        }
    }

    public double getTotalBillAmount()
    {
        return totalBillAmount;
    }

    public boolean isBillPaid()
    {
        return isBillPaid;
    }

    public void setBillPaid(boolean billPaid)
    {
        isBillPaid = billPaid;
    }
}
