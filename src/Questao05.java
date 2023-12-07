import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        new DecimalFormat("#.##");
        new DecimalFormatSymbols(Locale.US); //pra poder aceitar do usuário número com vírgula ao invés de número com ponto

        System.out.println("Qual a sua altura? ");
        double altura = input.nextDouble();
        System.out.println("Qual o seu peso? ");
        int peso = input.nextInt();
        double imc = (double)peso / Math.pow(altura, 2.0);
        if (imc < 17.0) {
            System.out.println("Seu IMC é: " + imc + ". Você está muito abaixo do peso");
        } else if (imc >= 17.0 && imc <= 18.49) {
            System.out.println("Seu IMC é: " + imc + ". Você está abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Seu IMC é: " + imc + ". Você está com o peso normal");
        } else if (imc >= 25.0 && imc <= 29.99) {
            System.out.println("Seu IMC é: " + imc + ". Você está acima do peso");
        } else if (imc >= 30.0 && imc <= 34.99) {
            System.out.println("Seu IMC é: " + imc + ". Você está com obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.99) {
            System.out.println("Seu IMC é: " + imc + ". Você está com obesidade grau II (severa)");
        } else if (imc > 40.0) {
            System.out.println("Seu IMC é: " + imc + ". Você está com obesidade grau III (mórbida)");
        }
    }
}
