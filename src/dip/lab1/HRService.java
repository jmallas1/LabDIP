package dip.lab1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {
    /** 
     * Constants can be used for retrieving annual wages of
     * various employee types. Is this the best way to go? Do we have
     * type safety?
     */
    public static final String SALARIED_TYPE = "Salaried";
    public static final String HOURLY_TYPE = "Hourly";

    /**
     * Alternatively to the above, we could use an enum. Does this improve
     * type safety?
     */
    public enum WageType {
        SALARIED,
        HOURLY
    }

    private static final String ERROR_MSG =
            "Cannot get annual wages because no valid employee type provided";
    private static final String ERROR_TITLE = "Employee Type Unknown";

    /**
     * This might be another 'poor decision,' but I just gave responsibility
     * of calculating annual comp to the sub classes.
     */
    public double getAnnualCompensationForEmployee(Employee e)
    {
        double annualCompensation;

        annualCompensation = e.getAnnualCompensation();

        return annualCompensation;
    }
}
