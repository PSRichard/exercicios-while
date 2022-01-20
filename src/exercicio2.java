import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x, y;
		
		System.out.println("Digite as coordenadas do eixo X e eixo Y:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x != 0 && y!= 0) {
			if(x > 0 && y > 0) {
				System.out.println("PRIMEIRO QUADRANTE");
				System.out.println("Digite as novas coodernadas:");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			else if(x < 0 && y > 0) {
				System.out.println("SEGUNDO QUADRANTE!");
				System.out.println("Digite as novas coodernadas:");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			else if(x < 0 && y < 0) {
				System.out.println("TERCEIRO QUADRANTE!");
				System.out.println("Digite as novas coodernadas:");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			else {
				System.out.println("QUARTO QUADRANTE!");
				System.out.println("Digite as novas coodernadas:");
				x = sc.nextInt();
				y = sc.nextInt();
			}
				
		}
		
		
		sc.close();
	}

}
