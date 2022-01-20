import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, alcool, gasolina, diesel;
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		
		System.out.println("Digite o número do seu produto de preferência:");
		System.out.println("(1) Álcool");
		System.out.println("(2) Gasolina");
		System.out.println("(3) Diesel");
		System.out.println("(4) Encerrar");
		
		x = sc.nextInt();
		
		while(x != 4) {
						
			if(x == 1) {
				alcool += 1;
				x = sc.nextInt();
			}
			
			else if(x == 2) {
				gasolina += 1;
				x = sc.nextInt();
			}
				 
			else if(x == 3) {
				diesel += 1;
				x = sc.nextInt();
			}
			else {
				System.out.println("Opção invalida! Digite novamente:");
				x = sc.nextInt();
			}
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Álcool: "+ alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Diesel: " + diesel);

				
		sc.close();
		}

}
