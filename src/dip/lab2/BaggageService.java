package dip.lab2;

public class BaggageService extends AbstractService
{
    private int bagCount;

    public BaggageService(int bagCount)
    {
        this.bagCount = bagCount;
        this.setServiceQuality(super.genQuality());
    }

    @Override
    public Float genBill() {
        return 0.00f;
    }

    @Override
    public float getBill()
    {
        return 0.00f;
    }

    public int getBagCount()
    {
        return this.bagCount;
    }
}
