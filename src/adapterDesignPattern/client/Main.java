package adapterDesignPattern.client;

import adapterDesignPattern.adaptee.WeightMachineForBabies;
import adapterDesignPattern.adapter.WeightMachineAdapter;
import adapterDesignPattern.adapter.WeightMachineAdapterImpl;

public class Main
{
    public static void main(String[] args)
    {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
