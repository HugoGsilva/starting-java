import java.text.DecimalFormat;
import java.util.Scanner;

public class analiseCUpom {
    public static void main(String[] args) throws Exception {
        
          Scanner perguntas = new Scanner(System.in);

          // esquema comum de perguntas mas userei string para indicar qual vai ser o cupom e farei o calculo
          // dentro da area do cupom usando int e double em vez de string

          System.out.println("informe seu cupom, com apenas letras MAISCULAS");
          String cupom = perguntas.nextLine();

        if (cupom.equals("QUERO15")) {
            System.out.println("Informe quantos litros abastecerá");
            int litros1 = perguntas.nextInt();
            
            double ValorT1 = litros1 * 3.99;
            double desconto1 = ValorT1 * 0.15;
            double valordescontado1 = ValorT1 - desconto1;

            // para melhor visualização do usuario irei usar o decimal format, para cortar os numeros quebrados

            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println("Valor total R$ " + df.format(ValorT1));
            System.out.println("Cupom válido! Novo valor R$ " + df.format(valordescontado1));

        }
        else if (cupom.equals("VERDE20")) {
            System.out.println("Informe quantos litros abastecerá");
            int litros2 = perguntas.nextInt();

            // fiz um if dentro da analise do cupom verde para caso a pessoa ultrapassar os
            // 40 litros ja entregar o valor total e encerrar o codigo
            
            if (litros2 > 30) {
                System.out.println("Cupom correto, mas limite de 30 litros ultrapassado");

                double maximo = litros2 * 3.99;
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Valor total R$ " + df.format(maximo));
                System.out.println("Nem um desconto aplicado");
                return;
            
            }
            else {
                double ValorT2 = litros2 * 3.99;
                double desconto2 = litros2 * 0.20;
                double valordescontado2 = ValorT2 - desconto2;
            
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Valor total R$ " + df.format(ValorT2));
                System.out.println("Cupom válido! Novo valor R$ " + df.format(valordescontado2));

            }
            

        }
        else if (cupom.equals("MAX10")) {
            System.out.println("Informe quantos litros abastecerá");
            int litros3 = perguntas.nextInt();

            if (litros3 < 41) {
                System.out.println("Cupom correto, mas nao alcançou os 40 litros necessario");

                double minimo = litros3 * 3.99;
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Valor total R$ " + df.format(minimo));
                System.out.println("Nem um desconto aplicado");
                return;
            }
            else {
                double ValorT3 = litros3 * 3.99;
                double valordescontado3 = ValorT3 - 10.00;

                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Valor total R$ " + df.format(ValorT3));
                System.out.println("Cupom válido! Novo valor R$ " + df.format(valordescontado3));

                
            }
        }
        else {
            System.out.println("Informe quantos litros abastecerá");
            int litros4 = perguntas.nextInt();
            double ValorT4 = litros4 * 3.99;

            DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Valor total R$ " + df.format(ValorT4));
                System.out.println("Cupom invalido nem um desconto aplicado");

        }


        

    }
}




// System.out.println("informe quantos litros abastecerá");
///int litros = perguntas.nextLine();
//DecimalFormat df = new DecimalFormat("#.##");