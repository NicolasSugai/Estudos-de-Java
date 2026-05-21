package aulasCursoEmVideo;
public class aulaVetores {
    public static void main(String[] args){
    //declarando vetor de quatro casas
        int vetor1[] = new int[4];
        vetor1[0] = 1;
        vetor1[1] = 2;
        vetor1[2] = 3;
        vetor1[3] = 4;
    
    //declarando vetor com valores diretos
        int vetor2[] = {1,2,3,4};

    //Java não sabe imprimir (print) vetores diretamente
        for (int i=0; i<4;i++){
            System.out.println(vetor1[i]);
        }
        System.out.println("Agora vetor2: ");
        for (int i=0; i<4;i++){
            System.out.println(vetor2[i]);
        }
    }
}

