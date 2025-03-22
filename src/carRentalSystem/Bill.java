package carRentalSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
        LocalDate from = reservation.getBookedFrom();
        LocalDate till = reservation.getBookedTill();
        if(ReservationType.DAILY.equals(reservation.getReservationType()))
        {
            long days = ChronoUnit.DAYS.between(from, till);
            totalBillAmount = days * reservation.getVehicle().getDailyRentalCost();
        }
        else
        {
            long hours = ChronoUnit.HOURS.between(from.atStartOfDay(), till.atStartOfDay());
            totalBillAmount = hours * reservation.getVehicle().getHourlyRentalCost();
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
