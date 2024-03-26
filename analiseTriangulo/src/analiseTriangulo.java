import java.util.Scanner;

public class analiseTriangulo {
    public static void main(String[] args) {
        Scanner perguntas = new Scanner(System.in);
    
            System.out.println("Insira o comprimento  do primeiro lado com apenas numeros inteiros");
            double lado1 = perguntas.nextDouble();
            
            System.out.println("Insira o comprimento  do segundo lado com apenas numeros inteiros");
            double lado2 = perguntas.nextDouble();

            System.out.println("Insira o comprimento  do terceiro lado com apenas numeros inteiros");
            double lado3 = perguntas.nextDouble();

            if (lado1 == lado2 && lado2 == lado3  ) {
                System.out.println("Triângulo Equilátero: possui os 3 lados iguais.");
            }
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isóscele: possui 2 lados iguais. ");
            }
            else {
                System.out.println("Triângulo Escaleno: possui 3 lados diferentes.");

             }

        perguntas.close();
        

    }
}
