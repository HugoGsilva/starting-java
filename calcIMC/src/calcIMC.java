import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormatSymbols; 
import java.text.ParseException;
import java.util.Locale;
// parte que importa as libs


public class calcIMC {

    public static void main(String[] args) throws ParseException {

        @SuppressWarnings("deprecation")
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt_BR")); // perguntar ao professor se tem uma pratica melhor para isso.
        DecimalFormat df = new DecimalFormat("#.##", symbols); // parte que corta os numeros quebrados
        Scanner pergunta = new Scanner(System.in);

        // parte que ensina o que cada lib importada faz
        
        System.out.println("Insira seu peso");
        double peso = pergunta.nextDouble();
        
        System.out.println("Insira sua altura ");
        String altura = pergunta.next();

        System.out.println("você é homem ou mulher");
        String genero = pergunta.next();

        // print com o necessario para o usuario

        if (!altura.contains(".")) { // parte onde adiciona o ponto caso o usuario escreva tudo junto
            altura = altura.substring(0, altura.length() - 2) + "." + altura.substring(altura.length() - 2);
            }

        double alturanum = Double.parseDouble(altura);
     
        double imc = peso / (alturanum * alturanum);

        String imcBonito = df.format(imc);

        double imcDouble = df.parse(imcBonito).doubleValue(); // converte em double para o prox passo

        System.out.println("Seu IMC é " + imcBonito);

        // calculo do imc

        if (genero.equals("homem")){
            if (imcDouble >= 39.9 ) {
                System.out.println("Obesidade morbida ");
            }
            else if (imcDouble >= 30 && imcDouble <= 39.9  ) {
                System.out.println("Obesidade moderada");
            }
            else if (imcDouble >= 25 && imcDouble <= 29.9  ) {
                System.out.println("Obesidade leve");
            }
            else if (imcDouble >= 20 && imcDouble <= 24.9  ) {
                System.out.println("Saudavel");
            }
            else if (imcDouble <= 19.9  ) {
                System.out.println("Abaixo do normal");
            }
            
        }
        else if (genero.equals("mulher")){
            if (imcDouble >= 38.9 ) {
                System.out.println("Obesidade morbida ");
            }
            else if (imcDouble >= 29 && imcDouble <= 38.9  ) {
                System.out.println("Obesidade moderada");
            }
            else if (imcDouble >= 24 && imcDouble <= 28.9  ) {
                System.out.println("Obesidade leve");   
            }
            else if (imcDouble >= 19 && imcDouble <= 23.9  ) {
                System.out.println("Saudavel");
            }
            else if (imcDouble <= 18.9  ) {
                System.out.println("Abaixo do normal");
            }

        }
        else {
            System.out.println("insira um genero dentro das duas opçoes");    
        }

        pergunta.close();
    }
}
