import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o seu nome: ");
        String nome = input.nextLine();

        System.out.print("Insira o seu salário (sem ponto): ");
        double salario = input.nextDouble();

        System.out.print("Insira a sua idade: ");
        int idade = input.nextInt();

        System.out.print("Insira a sua altura (sem ponto): ");
        float altura = input.nextFloat();

        System.out.print("Insira o gênero que você se identifica (F ou M): ");
        String sexo = input.next(); //utilizado Método next(), pois com nextLine() Java já pula pra próxima linha e não aguardo usuário inserir valor

        System.out.printf(" Nome: %s\n Salário: %.2f\n Idade: %d\n Altura: %.2f\n Sexo: %s\n",
                nome, salario, idade, altura, sexo);
    }
}
