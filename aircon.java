import java.util.Scanner;
import java.text.DecimalFormat;
public class aircon
{
    public static void main(String[] args)
    {
        Double cPower,daily,monthly;
		int Usage;
		DecimalFormat df = new DecimalFormat(",###.00");
		
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Cooling Power (hp): ");
        cPower=sc.nextDouble();
        System.out.println("Usage (hours): ");
        Usage=sc.nextInt();
		daily = 10.0/1000 * Usage * 745.6999 * cPower;
		monthly = daily * 30;
		System.out.println("");
		System.out.println("Price of electricity consumption");
		System.out.println("\tDaily: "+df.format(daily)+" pesos");
		System.out.println("\tMonthly: "+df.format(monthly)+" pesos");		
        
    }
    
}