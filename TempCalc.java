import java.util.*;
public class TempCalc {

/*Converts any given temperature to either Fahrenheit, Celcius or Kelvin **/

public static void main(String[] args) {

try {
	Scanner in = new Scanner(System.in);
		
	System.out.println("Enter a temperature value: ");
	double num = in.nextDouble();
		
	System.out.println("What temperature scale is this temp? (Please enter corresponding number");
	System.out.println("1.)Celcius/n2.)Kelvin/n3.)Fahrenheit");
	int num2 = in.nextInt();
	System.out.println("What would you like to convert to?");
	System.out.println("1.)Celcius/n2.)Kelvin/n3.)Fahrenheit");
	int convert = in.nextInt();
	
	double a = CelsiustoF(num,num2,convert);
	double b = CelsiustoK(num,num2,convert);
	double c = KelvintoF(num,num2,convert);
	double d = KelvintoC(num,num2,convert);
	double e = FahrentoC(num,num2,convert);
	double f = FahrentoK(num,num2,convert);
	

		
	//printing out the answer for the corresponding input values
		
	if(num2 == 1 && convert == 3) {
		System.out.println(a);
	}
	else if(num2 == 1 && convert == 2) {
		System.out.println(b);
	}
	else if(num2 == 2 && convert == 3) {
		System.out.println(c);
	}
	else if(num2 == 2 && convert == 1) {
		System.out.println(d);
	}
	else if(num2 == 3 && convert == 1) {
		System.out.println(e);
}
	else if(num2 == 3 && convert == 2) {
		System.out.println(f);
	}
	else {
		System.out.println("Error: Conversion not found");
	}

}
catch (Exception a){
	System.out.println("Error: please try again.");
}
}


public static double CelsiustoF(double c_to_f, double num2, double num) {
	
	c_to_f = (9*(num/5.0)+32);
	return c_to_f;
}
//method for Celsius to Kelvin conversion
public static double CelsiustoK(double c_to_k, int num2, double num) {
	c_to_k = (num+273.15);
	return c_to_k;
}
//method for Kelvin to Fahrenheit conversion
public static double KelvintoF(double k_to_f,int num2, double num) {
	k_to_f = (5*(num-273.15)/9.0)+32;
	return k_to_f;
}
//method for Kelvin to Celsius conversion
public static double KelvintoC(double k_to_c, int num2, double num) {
	k_to_c = (num-273.15);
	return k_to_c;
}
//method for Fahrenheit to Celsius conversion
public static double FahrentoC(double f_to_c, int num2, double num) {
	f_to_c = (5*(num-32)/9.0);
	return f_to_c;
}
//method for Fahrenheit to Kelvin conversion
public static double FahrentoK(double f_to_k, int num2, double num) {
	f_to_k = (5*(num-32)/9.0)+273.15;
	return f_to_k;
}







}
