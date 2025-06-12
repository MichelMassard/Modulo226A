import java.util.Scanner;

/**
 * Classe principale che gestisce l'interfaccia utente del Diario Digitale.
 * Permette di aggiungere, visualizzare, cercare, modificare ed eliminare note
 * tramite un semplice menu testuale.
 *
 * @author Michel Massard
 * @version Giugno 2025
 */
public class DiarioDigitale {

    /**
     * Simula la pulizia dello schermo stampando molte righe vuote.
     * Questo serve a "pulire" la console in assenza di un vero comando di pulizia.
     */
    public static void pulisciConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    /**
     * Metodo principale che avvia il programma e gestisce il ciclo di interazione con l'utente.
     * Permette di scegliere varie opzioni per gestire le note del diario.
     *
     * @param args gli argomenti della riga di comando (non usati)
     * @throws InterruptedException per gestire le pause temporali con Thread.sleep
     */
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Diario mioDiario = new Diario("diario.txt"); // istanza del diario con file di salvataggio

        while (true) {
            pulisciConsole();

            System.out.println("Benvenuto nel Diario Digitale!");
            System.out.println("");
            Thread.sleep(200); // breve pausa per migliore esperienza utente

            System.out.println("+--------------------------------------+");
            System.out.println("|Ecco le opzioni disponibili:          |");
            System.out.println("+--------------------------------------+");
            System.out.println("|1. Aggiungi una nuova nota            |");
            Thread.sleep(200);
            System.out.println("|2. Visualizza tutte le note           |");
            Thread.sleep(200);
            System.out.println("|3. Cerca una nota per titolo          |");
            Thread.sleep(200);
            System.out.println("|4. Modifica il contenuto di una nota  |");
            Thread.sleep(200);
            System.out.println("|5. Elimina una nota per titolo        |");
            Thread.sleep(200);
            System.out.println("|6. Esci dal programma                 |");
            System.out.println("+--------------------------------------+");
            System.out.println("");

            System.out.print("Scrivi il numero dell'opzione scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // consuma il newline rimasto

            if (scelta == 1) {
                // Aggiungi una nuova nota
                System.out.print("Inserisci il titolo della nota: ");
                String titolo = scanner.nextLine();

                System.out.print("Inserisci il contenuto della nota: ");
                String contenuto = scanner.nextLine();

                System.out.print("Inserisci la data (es. 10-06-2025): ");
                String data = scanner.nextLine();

                Nota nuovaNota = new Nota(titolo, contenuto, data);
                mioDiario.aggiungiNota(nuovaNota);

                System.out.println("Nota aggiunta con successo!");
                System.out.println("Premi INVIO per continuare...");
                scanner.nextLine();
                pulisciConsole();

            } else if (scelta == 2) {
                // Visualizza tutte le note
                mioDiario.visualizzaNote();
                System.out.println("Premi INVIO per continuare...");
                scanner.nextLine();
                pulisciConsole();

            } else if (scelta == 3) {
                // Cerca una nota per titolo
                System.out.print("Inserisci il titolo da cercare: ");
                String titoloDaCercare = scanner.nextLine();
                mioDiario.cercaNotaPerTitolo(titoloDaCercare);
                System.out.println("Premi INVIO per continuare...");
                scanner.nextLine();
                pulisciConsole();

            } else if (scelta == 4) {
                // Modifica il contenuto di una nota
                System.out.print("Titolo della nota da modificare: ");
                String titoloModifica = scanner.nextLine();

                System.out.print("Scrivi il nuovo contenuto: ");
                String nuovoContenuto = scanner.nextLine();

                boolean modificata = mioDiario.modificaContenutoPerTitolo(titoloModifica, nuovoContenuto);
                if (modificata) {
                    System.out.println("Nota modificata correttamente!");
                } else {
                    System.out.println("Nota non trovata.");
                }
                System.out.println("Premi INVIO per continuare...");
                scanner.nextLine();
                pulisciConsole();

            } else if (scelta == 5) {
                // Elimina una nota per titolo
                System.out.print("Titolo della nota da eliminare: ");
                String titoloElimina = scanner.nextLine();

                boolean eliminata = mioDiario.eliminaNotaPerTitolo(titoloElimina);
                if (eliminata) {
                    System.out.println("Nota eliminata!");
                } else {
                    System.out.println("Nota non trovata.");
                }
                System.out.println("Premi INVIO per continuare...");
                scanner.nextLine();
                pulisciConsole();

            } else if (scelta == 6) {
                // Esci dal programma
                System.out.print("Sei sicuro di voler uscire? (Scrivi SI per confermare): ");
                String risposta = scanner.nextLine();
                if (risposta.equals("SI")) {
                    System.out.print("Uscita in corso");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.println();
                    System.out.println("Ciao! Grazie per aver usato il diario :)");
                    Thread.sleep(1500);
                    break;
                } else {
                    System.out.println("Uscita annullata. Torno al menu...");
                    Thread.sleep(1000);
                    pulisciConsole();
                }

            } else {
                // Opzione non valida
                System.out.println("Scelta non valida! Riprova.");
                Thread.sleep(1000);
                pulisciConsole();
            }
        }

        scanner.close(); // chiudo lo scanner alla fine
    }
}
