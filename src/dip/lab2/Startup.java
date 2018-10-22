package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;
import java.util.ArrayList;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    public static void main(String[] args)
    {
        ArrayList<AbstractService> asl = new ArrayList<AbstractService>();

        for (int x = 1; x <= 10; x++)
        {
            asl.add(new BaggageService(x));
            asl.add(new FoodService());
        }

        TipCalculator tc = null;

        for (AbstractService as: asl )
        {
            if(as instanceof FoodService)
            {
                tc = new FoodServiceTipCalculator((FoodService)as);
            }
            else if(as instanceof BaggageService)
            {
                tc = new BaggageServiceTipCalculator((BaggageService)as);
            }
            System.out.println("Base bill for service: " + as.getBill());
            System.out.println("Tip of: " + tc.generateTip());
            System.out.println("For service level: " + as.getServiceQuality());
            System.out.println("\n\n\n");
        }
    }

}
