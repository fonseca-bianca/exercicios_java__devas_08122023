import java.util.Scanner;
public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Área do Retângulo:
        System.out.println("Digite a largura do retângulo: ");
        int larguraRetangulo = input.nextInt();

        System.out.println("Digite a altura do retângulo: ");
        int alturaRetangulo = input.nextInt();

        int areaRetangulo = larguraRetangulo * alturaRetangulo;

        System.out.println("A área do retângulo é: " + areaRetangulo);

        //Área do Triângulo:
        System.out.println("Digite a base do triângulo: ");
        int baseTriangulo = input.nextInt();

        System.out.println("Digite a altura do triângulo: ");
        int alturaTriangulo = input.nextInt();

        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("A área do triângulo é: " + areaTriangulo);
        /*coloquei double, pq com o 'int' considerei q o usuário pudesse colocar um número q o resultado desse com decimal
          por isso incluí o if abaixo. Encontrei o método Math.floor() q retorna um double
          esse método arredonda um int pra double (ex.: 1 --> 1.0)*/

        if (areaTriangulo != Math.floor(areaTriangulo)){
            System.out.println("A área do triângulo é: " + (int) areaTriangulo);
            //aq (int) vai converter 'double' pra 'int', caso o resultado tenha número decimal
        }

        //Área do Círculo:
        System.out.println("Digite o raio do círculo: ");
        double raioCirculo = input.nextDouble();

        double areaCirculo = (raioCirculo * raioCirculo) * 3.14;

        System.out.println("A área do círculo é: " + areaCirculo);

        //Área do Trapézio:
        System.out.println("Digite o comprimento da base maior do trapézio: ");
        int baseMaiorTrapezio = input.nextInt();

        System.out.println("Digite o comprimento da base menor do trapézio: ");
        int baseMenorTrapezio = input.nextInt();

        System.out.println("Digite a altura do trapézio: ");
        int alturaTrapezio = input.nextInt();

        int areaTrapezio = (baseMaiorTrapezio * baseMenorTrapezio) * alturaTrapezio / 2;

        System.out.println("A área do trapézio é: " + areaTrapezio);
    }
}
