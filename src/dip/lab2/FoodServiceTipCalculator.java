package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator
{
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;
    private float serviceBill;
    private FoodService fs;

    public FoodServiceTipCalculator(FoodService service)
    {
        fs = service;
        serviceBill = fs.getBill();
    }

    @Override
    public double generateTip()
    {
        switch (fs.getServiceQuality())
        {
            case POOR:
                return serviceBill * POOR_RATE;
            case FAIR:
                return serviceBill * FAIR_RATE;
            case GOOD:
                return serviceBill * GOOD_RATE;
            default:
                return serviceBill * GOOD_RATE;
        }
    }

}
