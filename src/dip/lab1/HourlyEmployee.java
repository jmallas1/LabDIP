package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;


    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    public void setTotalHrsForYear(double totalHrsForYear) { this.totalHrsForYear = totalHrsForYear; }
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double getAnnualCompensation()
    {
        return (totalHrsForYear * hourlyRate);
    }
}
