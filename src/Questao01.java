import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //pra receber os dados

        System.out.print("Insira o seu nome: ");
        String nome = input.nextLine(); //avança scanner pra próxima linha e retorna entrada

        System.out.print("Insira a sua profissão: ");
        String profissao = input.nextLine();


        System.out.print("Insira a sua idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.printf("%s\n", nome); //"\n" pra quebrar linha
        System.out.print(profissao);
        System.out.println("\n" + idade);
    }
}
