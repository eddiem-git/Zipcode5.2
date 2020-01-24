
/**
 * Write a description of class PayDay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayDay
{
    // instance variables - replace the example below with your own
    
    private int x;
    
    /**
     * Create implementation for PayDay
     */
    public PayDay()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     *  create a stub of name, pay, tax, net
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static String pay(String Name, double taxRate, double hourlyRate,double hoursWorked)
    {
        double grossPay;
        double totalDeduc;
        double netPay;
        
        grossPay = hourlyRate * hoursWorked;
        totalDeduc = taxRate * grossPay;
        netPay = grossPay - totalDeduc;
        
        return String.format("%s %.2f %.2f %.2f" , Name, grossPay, totalDeduc, netPay);
        
        
        
        
        
    }
}
