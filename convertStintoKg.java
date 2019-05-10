import java.util.Scanner;
//in this program you can enter weight in stone and convert it into kg.
public class Main
{
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number of stones you want to convert into kg: ");//displays
		int st = number.nextInt();//reads number from the keyboard
		System.out.println(convertStintoKg(st));//displays converted number
		
	}
	public static double convertStintoKg(int st){
	    double kg = st * 6.35;//conversion
	    return kg;
	}
}
