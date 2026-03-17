// Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.

import javax.swing.JOptionPane;

public class Ex01{
    public static void main(String[] args)
    {
        double LADO, AREA;
        LADO = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: "));
        AREA = (LADO*LADO);


        // Apresentando o resultado
        System.out.println("O lado do quadrado é: " + LADO);
        System.out.println("A área do quadrado é: " + AREA);
    }  
}
