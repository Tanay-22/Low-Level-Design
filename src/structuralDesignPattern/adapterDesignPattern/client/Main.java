package structuralDesignPattern.adapterDesignPattern.client;

import structuralDesignPattern.adapterDesignPattern.adaptee.WeightMachineForBabies;
import structuralDesignPattern.adapterDesignPattern.adapter.WeightMachineAdapter;
import structuralDesignPattern.adapterDesignPattern.adapter.WeightMachineAdapterImpl;

public class Main
{
    public static void main(String[] args)
    {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
