package dip.lab2;

import java.util.Random;

public class FoodService extends AbstractService
{
    public FoodService()
    {
        this.setServiceQuality(super.genQuality());
        this.setBill(this.genBill());
    }

    @Override
    public Float genBill()
    {
        float minBill = 15.00f;
        float maxBill = 75.00f;

        Random rn = new Random();
        return rn.nextFloat() * (maxBill - minBill) + minBill;
    }
}
