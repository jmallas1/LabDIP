package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator
{
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;
    private static final double baseBagTip = 1.00;
    private BaggageService bs;

    public BaggageServiceTipCalculator (BaggageService service)
    {
        bs = service;
    }

    @Override
    public double generateTip() {
        switch (bs.getServiceQuality())
        {
            case POOR:
                return bs.getBagCount() * baseBagTip * (1 + POOR_RATE);
            case FAIR:
                return bs.getBagCount() * baseBagTip * (1 + FAIR_RATE);
            case GOOD:
                return bs.getBagCount() * baseBagTip * (1 + GOOD_RATE);
            default:
                return bs.getBagCount() * baseBagTip * (1 + POOR_RATE);
        }
    }
}
