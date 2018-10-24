package dip.lab2;

public class BaggageService extends AbstractService
{
    private int bagCount;

    public BaggageService(int bagCount)
    {
        if (bagCount > 0)
        {
            this.bagCount = bagCount;
        }
        else
        {
            throw new IllegalArgumentException("Bag count must be greater than zero");
        }

        this.setServiceQuality(super.genQuality());
        this.setBill(0.00f);
        this.setServiceType(ServiceType.BAGGAGE);
    }

    public int getBagCount()
    {
        return this.bagCount;
    }
}
