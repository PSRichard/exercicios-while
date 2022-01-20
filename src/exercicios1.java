import java.util.Locale;
import java.util.Scanner;

public class exercicios1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int senha;
		
		System.out.print("DIGITE SUA SENHA: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.print("SENHA INVALIDA! TENTE NOVAMENTE:");
			senha = sc.nextInt();
		}
		
		
		System.out.println("ACESSO PERMITIDO!");
		
		
		sc.close();
	}

}
