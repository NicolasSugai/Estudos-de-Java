// Receba o salário de um funcionário e mostre o novo salário com reajuste 
//de 15%.

import javax.swing.JOptionPane;
public class Ex02{
    public static void main(String[] args)
    {
        double SALARIO, NOVO_SALARIO;
        SALARIO = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário: "));
        NOVO_SALARIO = SALARIO + (SALARIO * 0.15);
        System.out.println("Salário atual: "+NOVO_SALARIO);
    }
}