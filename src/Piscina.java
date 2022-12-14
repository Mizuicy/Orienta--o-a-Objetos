import java.util.Scanner;

public class Piscina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Criando uma variavel com o nome da class que foi criada é possivel pegar os dados dentro dela
        com um new */ 
        DadosPiscina primeirPiscina = new DadosPiscina();

        System.out.println("Digite aqui o comprimento da piscina  ↡");
        primeirPiscina.comprimento = scanner.nextInt();

        System.out.println("Digite aqui a largura da piscina  ↡");
        primeirPiscina.largura = scanner.nextInt();

        System.out.println("Digite aqui a profundidade da piscina  ↡");
        primeirPiscina.profundidade = scanner.nextInt();

        primeirPiscina.volume = (primeirPiscina.comprimento * primeirPiscina.largura) * primeirPiscina.profundidade;

        System.out.println("O volume dessa piscina é "+ primeirPiscina.volume + "m³.");
    }
}
