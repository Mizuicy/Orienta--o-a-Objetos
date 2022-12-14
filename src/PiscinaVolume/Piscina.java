package PiscinaVolume;

public class Piscina {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();

        /* Criando uma variavel com o nome da class que foi criada é possivel pegar os dados dentro dela
        com um new */ 
        DadosPiscina primeirPiscina = new DadosPiscina();

        primeirPiscina.comprimento = leitor.lerInteiro("Digite aqui o comprimento da piscina  ↡");

        primeirPiscina.largura = leitor.lerInteiro("Digite aqui a largura da piscina  ↡");

        primeirPiscina.profundidade = leitor.lerInteiro("Digite aqui a profundidade da piscina  ↡");

        System.out.println("O volume dessa piscina é "+ primeirPiscina.volume() + "m³.");
    }
}
