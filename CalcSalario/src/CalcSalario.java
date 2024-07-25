import java.util.Scanner;

public class CalcSalario {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.print("Digite o valor da hora aula "); 
        double valorHoraAula = Teclado.nextDouble();

        System.out.print("Digite o número de aulas dadas no mês: ");
        int numeroAulasMes = Teclado.nextInt();

        System.out.print("Digite o percentual de desconto do INSS: ");
        double INSS = Teclado.nextDouble();

        double semdesconto = valorHoraAula * numeroAulasMes;

        double descontoINSS = (INSS / 100) * semdesconto;

        double Descontado = semdesconto - descontoINSS;

        System.out.println("seu salario  é de " + Descontado);

        
        Teclado.close();
    }
}
