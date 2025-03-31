package structural.adapter.adapter;

import structural.adapter.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter
{
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine)
    {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg()
    {
        return weightMachine.getWeightInPound() * 0.45;
    }
}
