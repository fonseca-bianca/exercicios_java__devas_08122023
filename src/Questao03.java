import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Módulo 1 - Controle de tempo x funcionários::
        System.out.println("Digite o ano atual da missão: ");
        short anoAtualMissao = input.nextShort();

        System.out.println("Digite a quantidade de funcionários envolvidos: ");
        byte funcionariosEnvolvidos = input.nextByte();

        //Módulo 2 - Controle de distância x velocidade:
        System.out.println("Digite a distância entre o satélite e a Terra (máx. 2 milhões): ");
        int distanciaSatelite = input.nextInt();

        System.out.println("Digite a velocidade máxima (máx. 30.000km/h): ");
        short velocidadeMaxima = input.nextShort();

        //Módulo 3 - Status da Missão:
        System.out.println("Missão já iniciou? T(sim) ou F(não)");
        boolean statusMissao = input.nextBoolean();

        System.out.println("Distância que será percorrida durante a missão em km (máx. 3 bilhões): ");
        long distanciaDuranteMissao = input.nextLong();

        System.out.println("Calibragem das antenas (máx. 14 casas decimais após vírgula): ");
        double calibragem = input.nextDouble();
        input.nextLine();

        //Todos os valores printados abaixo:
        System.out.println("Ano atual da missão: " + anoAtualMissao);
        System.out.println("Quantidade de funcionários envolvidos na missão: " + funcionariosEnvolvidos);
        System.out.println("Distância entre o satélite e a Terra: " + distanciaSatelite);
        System.out.println("Velocidade máxima: " + velocidadeMaxima + "km/h");
        System.out.println("Missão iniciada? " + (statusMissao? "Sim" : "Não")); //com op. ternário imprimiu direto a resposta do usuário, sem apresentar as 2 opções boolean
        System.out.println("Distância percorrida durante a missao: " + distanciaDuranteMissao);
        System.out.println("Calibragem das antenas: " + calibragem);
    }
}
