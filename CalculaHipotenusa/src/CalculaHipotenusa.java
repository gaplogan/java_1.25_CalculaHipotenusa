import java.util.Scanner;

public class CalculaHipotenusa {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        int cat1, cat2, hipo;

        System.out.print("Digite o valor do primeiro cateto: ");
        cat1 = entrada.nextInt();
        cat1 = Math.abs(cat1);

        System.out.print("Digite o valor do segundo cateto: ");
        cat2 = entrada.nextInt();
        cat2 = Math.abs(cat2);

        hipo = (int)Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

        System.out.println("Valor da hipotenusa: " + hipo);

        entrada.close();
    }
}
