//Receba a base e a altura de um triângulo. Calcule e mostre a sua área
import javax.swing.JOptionPane;
public class Ex03 {
    public static void main(String[] args) {
        Double BASE, ALTURA, AREA;
        BASE = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui a base do triângulo: "));
        ALTURA = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui a altura do triângulo: "));
        AREA = (BASE * ALTURA) / 2;
        JOptionPane.showMessageDialog(null,"A área do triângulo é: " + AREA);
    }
}
