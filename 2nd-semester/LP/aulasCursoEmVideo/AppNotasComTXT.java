package aulasCursoEmVideo;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppNotasComTXT {
    public static void main(String[] args) {
        // Criamos os vetores vazios para 20 alunos
        String[] generos = new String[20];
        double[] notas = new double[20];

        // ==========================================
        // 1. CARREGANDO OS DADOS DO ARQUIVO TXT
        // ==========================================
        try {
            // Abre o arquivo dados.txt para leitura
            FileReader fr = new FileReader("dados.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String linha;
            int indice = 0;

            // O laço lê linha por linha até o arquivo acabar (null) ou o vetor encher
            while ((linha = br.readLine()) != null && indice < generos.length) {
                
                // Se a linha for "M;8.5", o split divide em: dadosAluno[0]="M" e dadosAluno[1]="8.5"
                String[] dadosAluno = linha.split(";");
                
                generos[indice] = dadosAluno[0];                    // Guarda o gênero
                notas[indice] = Double.parseDouble(dadosAluno[1]);  // Converte e guarda a nota
                
                indice++; // Passa para a próxima gaveta do vetor
            }
            
            br.close(); // Fecha o arquivo após terminar a leitura
            
        } catch (IOException e) {
            // Se o arquivo não existir ou der erro, o Java avisa e fecha o programa com o 'return'
            JOptionPane.showMessageDialog(null, "Erro crítico: O arquivo 'dados.txt' não foi encontrado na pasta!");
            return; 
        }

        // ==========================================
        // 2. O MENU DO APLICATIVO (IGUAL ANTERIOR)
        // ==========================================
        int opcao = 0;

        while (opcao != 4) {
            String menu = "=== MENU DO APLICATIVO (DADOS CARREGADOS) ===\n"
                        + "1. Ver quem Passou e quem Reprovou\n"
                        + "2. Calcular Média dos Homens\n"
                        + "3. Calcular Média das Mulheres\n"
                        + "4. Sair\n\n"
                        + "Escolha uma opção:";

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String aprovados = "APROVADOS (Nota >= 6.0):\n";
                    String reprovados = "REPROVADOS (Nota < 6.0):\n";

                    for (int i = 0; i < notas.length; i++) {
                        if (notas[i] >= 6.0) {
                            aprovados += "Aluno " + (i+1) + " (" + generos[i] + ") - Nota: " + notas[i] + "\n";
                        } else {
                            reprovados += "Aluno " + (i+1) + " (" + generos[i] + ") - Nota: " + notas[i] + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, aprovados + "\n" + reprovados);
                    break;

                case 2:
                    double somaH = 0;
                    int contH = 0;
                    for (int i = 0; i < generos.length; i++) {
                        if (generos[i].equals("M")) {
                            somaH += notas[i];
                            contH++;
                        }
                    }
                    // Segurança caso não existam homens no arquivo para evitar divisão por zero
                    double mediaH = (contH > 0) ? (somaH / contH) : 0;
                    JOptionPane.showMessageDialog(null, "Média das notas dos Homens: " + mediaH);
                    break;

                case 3:
                    double somaM = 0;
                    int contM = 0;
                    for (int i = 0; i < generos.length; i++) {
                        if (generos[i].equals("F")) {
                            somaM += notas[i];
                            contM++;
                        }
                    }
                    // Segurança caso não existam mulheres no arquivo
                    double mediaM = (contM > 0) ? (somaM / contM) : 0;
                    JOptionPane.showMessageDialog(null, "Média das notas das Mulheres: " + mediaM);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do aplicativo... Até logo!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                    break;
            }
        }
    }
}