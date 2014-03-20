
public class EJER2 {

			public static int fib (int numero)//ejercicios realizado en clase de tutoria
			{ if(numero==0)
				{return 0;
				}
		
			if(numero==1)
			{ return 1;
		
			}
			int n = 0;
			return fib(numero-1) * fib(numero-2)+n;}
			
			public static void main(String[] args) {
				
		
				System.out.println(fib(0));
				System.out.println(fib(1));
			}
		
		}

