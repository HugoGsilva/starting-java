import java.util.Scanner;

public class faltaAluno {
    public static void main(String[] args) throws Exception {

        Scanner pergunta = new Scanner(System.in);

        System.out.println("insira sua carga horaria em horas");
        double cargaH = pergunta.nextDouble();

        System.out.println("Insira suas faltas");
        double faltas = pergunta.nextDouble();
        
        System.out.println("Insira nota do primeiro Bimestre");
        double b1 = pergunta.nextDouble();

        System.out.println("Insira nota do segundo Bimestre");
        double b2 = pergunta.nextDouble();

        System.out.println("Insira nota do terceiro Bimestre");
        double b3 = pergunta.nextDouble();

        System.out.println("Insira nota do quarto Bimestre");
        double b4 = pergunta.nextDouble();

        pergunta.close();

        //parte que pega os dados do usuario

        if (faltas > (cargaH*0.25)) {
            System.out.println("Você Reprovou Por Faltas" );
         }        
         else {
            double Mediafinal = (b1+b2+b3+b4) / 4;

            if (Mediafinal >= 6.0) {
                System.out.println("Você passou de ano");
            
            }
            else if (Mediafinal < 6.0){
                System.out.println("Você reprovou Por Notas");
            }

         }

         //parte que calcula se passou ou n


    }
}
