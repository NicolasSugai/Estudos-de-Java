package aulasCursoEmVideo;

import javax.swing.JOptionPane;
import java.io.*; // Coloque apenas isso para economizar espaço de imports!

public class ProvaMenu {

    // VETORES GLOBAIS: Facilita a prova à mão porque todos os métodos enxergam eles
    static String[] generos = new String[20];
    static double[] notas = new double[20];

    // MÉTODO PARA LER O ARQUIVO TXT (Simples e direto para o papel)
    public static void carregarDados() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("dados.txt"));
        String linha;
        int i = 0;
        
        while ((linha = br.readLine()) != null && i < 20) {
            String[] pedacos = linha.split(";");
            generos[i] = pedacos[0];
            notas[i] = Double.parseDouble(pedacos[1]);
            i++;
        }
        br.close();
    }

    // MÉTODO DO CASE 1: Separa aprovados e reprovados
    public static void mostrarStatus() {
        String txt = "Aprovados (>=6):\n";
        for (int i = 0; i < 20; i++) {
            if (notas[i] >= 6.0) txt += "Aluno " + (i+1) + " (" + generos[i] + "): " + notas[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, txt);
    }

    // MÉTODO DO CASE 2 e 3: Um único método que calcula a média por gênero!
    public static void calcularMediaPorGenero(String g, String nomeGen) {
        double soma = 0;
        int cont = 0;
        for (int i = 0; i < 20; i++) {
            if (generos[i].equals(g)) {
                soma += notas[i];
                cont++;
            }
        }
        double media = (cont > 0) ? (soma / cont) : 0;
        JOptionPane.showMessageDialog(null, "Média " + nomeGen + ": " + media);
    }

    // ALGORITMO PRINCIPAL (O Menu Dinâmico)
    public static void main(String[] args) {
        // O "throws Exception" no main substitui o try-catch na prova! Menos linhas para escrever.
        try { carregarDados(); } catch(Exception e) { } 

        int op = 0;
        while (op != 4) {
            String menu = "1-Status\n2-Média Homens\n3-Média Mulheres\n4-Sair";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {
                case 1: 
                    mostrarStatus(); 
                    break;
                case 2: 
                    calcularMediaPorGenero("M", "Homens"); 
                    break;
                case 3: 
                    calcularMediaPorGenero("F", "Mulheres"); 
                    break;
                case 4: 
                    JOptionPane.showMessageDialog(null, "Fim"); 
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Invalido");
            }
        }
    }
}