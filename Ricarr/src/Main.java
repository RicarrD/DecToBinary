import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args){
    
	    Locale.setDefault(Locale.US);
	    Scanner input = new Scanner(System.in);
	    int decimal, resto, memoria;
	    String binario="";
	    System.out.println("Qual numero decimal deseja converter?");
	    decimal = input.nextInt();
	    memoria = decimal;
	    while (decimal > 0) {
    	resto = (decimal%2);
    	binario = resto + binario;
    	decimal = decimal/2;
    }
    System.out.println("O numero " + memoria + " na base 2 sera igual a " + binario + " na base 2.");
    input.close();
    }
}