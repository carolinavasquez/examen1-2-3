import java.util.Scanner;


public class ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner teclado=new Scanner(System.in);
	        int suma,f,valor,promedio;
	        suma=0;
	        for(f=1;f<=20;f++) {
	            System.out.print("Ingrese valor:");
	            valor=teclado.nextInt();
	            suma=suma+valor;
	        }
	       
	        promedio=suma/10;
	        System.out.print("El promedio es:");
	        System.out.print(promedio);
	    }

	}
	


