package dip.lab2;

import java.util.Random;

public abstract class AbstractService
{
    private enum ServiceQuality { GOOD, FAIR, POOR }
    private enum ServiceType { FOOD, BAGGAGE }

    private float bill;
    private ServiceQuality serviceQuality;
    private ServiceType serviceType;

    public ServiceQuality genQuality()
    {
        Random rn = new Random();
        int choice = rn.nextInt((3 - 1) + 1) + 1;

        switch(choice)
        {
            case 1: return ServiceQuality.FAIR;
            case 2: return ServiceQuality.GOOD;
            case 3: return ServiceQuality.POOR;
            default: return ServiceQuality.FAIR;
        }
    }

    public abstract Float genBill();

    public float getBill() { return bill; }

    public void setBill(float bill) { this.bill = bill; }

    public ServiceQuality getServiceQuality() { return serviceQuality; }

    public void setServiceQuality(ServiceQuality serviceQuality) { this.serviceQuality = serviceQuality; }

    public ServiceType getServiceType() { return serviceType; }

    public void setServiceType(ServiceType serviceType) { this.serviceType = serviceType; }
}