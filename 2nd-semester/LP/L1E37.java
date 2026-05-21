/*Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu 
N’nésimo termo*/

import javax.swing.JOptionPane;

public class L1E37 {
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo final: "));

        int termo = 0;

        for (int i=1;i<=n;i++){
            

            JOptionPane.showMessageDialog(null, termo);
        }
    }
}
