import java.util.Scanner;

public class botCrimes {
    public static void main(String[] args) throws Exception {

        Scanner perguntas = new Scanner(System.in);    
         
        // usaremos a quantidade de respostas sim como valor inteiro começando em 0
        int RespostaSim = 0;

        //cada resposta sim adicionara 1 em valor para o valor inteiro, qualquer outra coisa escrita sera considerada nao
        
        System.out.println("Você estava presente no local do crime?");
        String pg1 = perguntas.nextLine();
            if (pg1.equalsIgnoreCase("sim")) {
            RespostaSim++;                    
        }

        System.out.println("Você conhecia a vítima?");
        String pg2 = perguntas.nextLine();
            if (pg2.equalsIgnoreCase("sim")) {
            RespostaSim++;                    
        }

        System.out.println("Você tinha motivos para cometer o crime?");
        String pg3 = perguntas.nextLine();
            if (pg3.equalsIgnoreCase("sim")) {
            RespostaSim++;                    
        }

        System.out.println("Você possui um álibi para o momento do crime?");
        String pg4 = perguntas.nextLine();
            if (pg4.equalsIgnoreCase("sim")) {
            RespostaSim++;                    
        }

        System.out.println("Você foi visto fugindo do local do crime?");
        String pg5 = perguntas.nextLine();
            if (pg5.equalsIgnoreCase("sim")) {
            RespostaSim++;                    
        }

        // analise simples do valor para "resposta sim"
        // usei o || como divisor, caso seja ou 3 ou 4 ele ira considerar o segundo else if

        if (RespostaSim == 2) {
            System.out.println("Suspeita");
        }
        else if (RespostaSim == 3 ||  RespostaSim == 4) {
            System.out.println("Cúmplice");
        } 
        else if (RespostaSim == 5) {
            System.out.println("culpado");
        }
        else
            System.out.println("inocente");
        perguntas.close();
    }   
}
