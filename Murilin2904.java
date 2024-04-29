package candicional;

import java.util.Scanner;

public class Murilin2904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double num, quad, cubo, raiz_NUMERICA;

        System.out.print("Digite um número: ");
        num = scanner.nextDouble();

        while (num > 0) {
            quad = num * num;
            cubo = num * num * num;
            raiz_NUMERICA = Math.sqrt(num);

            System.out.printf("Número: %.2f\n", num);
            System.out.printf("Quadrado: %.2f\n", quad);
            System.out.printf("Cube: %.2f\n", cubo);
            System.out.printf("raiz NUMERICA: %.2f\n", raiz_NUMERICA);

            System.out.print("Enter a number: ");
            num = scanner.nextDouble();
        }
    }
}
