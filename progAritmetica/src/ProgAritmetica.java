import java.util.Scanner;

public class ProgAritmetica {
    public static void main(String[] args) throws Exception {
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Digite a razão da PA: ");
        int razao = Teclado.nextInt();
    
        System.out.print("Digite o valor do primeiro termo da PA: ");
        int primeiro = Teclado.nextInt();

        int decimo = primeiro + (10 - 1) * razao;   

        System.out.printf("O 10º termo da PA é:" + decimo);
        Teclado.close();
    }
}
