package AlunosMedia;


public class Alunos {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        int quantidadeAlunos = 3;
        DadosAlunos[] alunos = new DadosAlunos[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            DadosAlunos aluno = new DadosAlunos();

            aluno.nome = leitor.lerString("Digite o nome do aluno");
            aluno.notas[0] = leitor.lerDecimal("Digite a nota 1 ");
            aluno.notas[1] = leitor.lerDecimal("Digite a nota 2 ");
            aluno.notas[2] = leitor.lerDecimal("Digite a nota 3 ");
            alunos[i] = aluno;
        }

        for (DadosAlunos aluno : alunos) {

            System.out.printf("%s teve a média %f.\n", aluno.nome, aluno.calcularMedia());
        }
    }
}
