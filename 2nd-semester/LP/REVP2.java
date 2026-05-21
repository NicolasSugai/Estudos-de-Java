/*Na prova de JAVA hoje (matéria LP), cairá os conteúdos do primeiro bimestre (aonde vimos conceitos básicos de JAVA, e:

- Instância de classes
- Modularização (tratamento, envio e retorno de parâmetros)
- Classe de transmissão/métodos/principal
-Manipulação de registro lógico (write e reader)
- Manipulação de arquivo (, criação de .txt, input e outpu)
-Recursividade
-Variáveis homogêneas 
-Vetores e matrizes*/

class Aluno{
    String nome;

    public void estudar(){
        System.out.println(nome+" está estudando!");
    }
}

public class REVP2 {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Estudante";
        aluno1.estudar();
    }
}
