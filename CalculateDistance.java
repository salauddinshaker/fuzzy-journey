import java.util.Scanner;
import java.text.DecimalFormat;
public class CalculateDistance{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat decForm = new DecimalFormat("0.##");
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double distance = 0;
		
		//input
		System.out.println(" Please enter x1 coordinates : ");
		x1 = scan.nextDouble();
		System.out.println(" Please enter y1 coordinates : ");
		y1 = scan.nextDouble();
		System.out.println(" Please enter x2 coordinates : ");
		x2 = scan.nextDouble();
		System.out.println(" Please enter y2 coordinates : ");
		y2 = scan.nextDouble();
		
		scan.close();
		
		distance = Math.sqrt(Math.pow(x2-x1,2) + (Math.pow(y2-y1,2)));
		System.out.println(" The distance is " + decForm.format(distance));
		
	}
}