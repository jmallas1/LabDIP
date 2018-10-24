package dip.lab2;

import java.util.Random;

public class FoodService extends AbstractService
{
    public FoodService()
    {
        this.setServiceQuality(super.genQuality());
        this.setBill(this.genBill());
        this.setServiceType(ServiceType.FOOD);
    }

    public Float genBill()
    {
        float rBill = 0.00f;
        float minBill = 15.00f;
        float maxBill = 75.00f;

        Random rn = new Random();
        rBill = rn.nextFloat() * (maxBill - minBill) + minBill;

        if (rBill < minBill)
        {
            throw new IllegalArgumentException("Minimum bill must be greater than " + minBill);
        }

        return rBill;
    }
}
