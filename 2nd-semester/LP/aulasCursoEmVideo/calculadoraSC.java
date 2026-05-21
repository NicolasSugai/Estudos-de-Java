package aulasCursoEmVideo;

import javax.swing.JOptionPane;

public class calculadoraSC {
    static double n1, n2;

    public static void soma(){
        double resp = n1+n2;
        System.out.print(resp);
    }

    public static void subtracao(){
        double resp = n1-n2;
        System.out.print(resp);
    }

    public static void multiplicacao(){
        double resp = n1*n2;
        System.out.print(resp);
    }

    public static void divisao(){
        double resp = n1/n2;
        System.out.print(resp);
    }

    public static void main(String[] args){
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        int op = 0;
        while(op != 5){
            String menu = "1-Somar\n2-Subtrair\n3-Multiplicação\n4-Divisão\n5-Sair";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(op) {
                case 1: soma(); break;
                case 2: subtracao(); break;
                case 3: multiplicacao(); break;
                case 4: divisao(); break;
                case 5: JOptionPane.showMessageDialog(null, "Tchau!"); break;
                default: JOptionPane.showMessageDialog(null, "Inválido");
            }
        }

    }
}
