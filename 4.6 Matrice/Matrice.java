import java.util.Random;
public class Matrice {
    public static void main(String[] args) {
        Random rnd = new Random(); //Oggetto generatore Random
        int casuale = 0;
		int dimensione;
		int maxCasuale;
        int [][] matrice = new int[dimensione][dimensione];
        for(int i = 0;i< dimensione; i++){
            for(int j = 0;j < dimensione; j++){
                casuale = rnd.nextInt(maxCasuale);
                matrice[i][j] = casuale;
                System.out.print(casuale);
            }
            System.out.println();
        }
    }
}