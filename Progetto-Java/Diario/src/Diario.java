import java.io.*;
import java.util.*;

/**
 * Questa classe rappresenta un diario dove è possibile aggiungere,
 * cercare, modificare, eliminare e visualizzare delle note.
 * Le note vengono salvate su file *
 * @author Michel Massard
 * @version Giugno 2025
 */
public class Diario {
    private ArrayList<Nota> note;
    private String filePath;

    /**
     * Costruttore del diario. Prova a caricare le note già esistenti dal file.
     *
     * @param filePath il percorso del file dove salvare e leggere le note
     */
    public Diario(String filePath) {
        this.note = new ArrayList<>();
        this.filePath = filePath;
        caricaNoteDaFile();
    }

    /**
     * Aggiunge una nuova nota al diario e aggiorna il file.
     *
     * @param nota la nota da aggiungere
     */
    public void aggiungiNota(Nota nota) {
        note.add(nota);
        salvaNoteSuFile();
    }

    /**
     * Mostra tutte le note salvate nel diario, una alla volta, con una breve pausa.
     */
    public void visualizzaNote() throws InterruptedException {
        if (note.isEmpty()) {
            System.out.println("Non ci sono note nel diario.");
        } else {
            for (Nota n : note) {
                Thread.sleep(2000);
                System.out.println("\n-------------------------------------------------");
                System.out.println(n.toString());
                System.out.println("-------------------------------------------------");
            }
        }
    }

    /**
     * Cerca una nota usando il titolo e la mostra se esiste.
     *
     * @param titolo il titolo della nota da cercare
     */
    public void cercaNotaPerTitolo(String titolo) {
        for (Nota n : note) {
            if (n.getTitolo().equalsIgnoreCase(titolo)) {
                System.out.println("\n-------------------------------------------------");
                System.out.println(n);
                System.out.println("-------------------------------------------------");
                return;
            }
        }
        System.out.println("Nota con titolo '" + titolo + "' non trovata.");
    }

    /**
     * Cerca una nota tramite il titolo e cambia il contenuto se la trova.
     *
     * @param titolo il titolo della nota da modificare
     * @param nuovoContenuto il nuovo contenuto da scrivere
     * @return true se la nota è stata trovata e modificata, false altrimenti
     */
    public boolean modificaContenutoPerTitolo(String titolo, String nuovoContenuto) {
        for (Nota n : note) {
            if (n.getTitolo().equalsIgnoreCase(titolo)) {
                n.setContenuto(nuovoContenuto);
                salvaNoteSuFile();
                return true;
            }
        }
        return false;
    }

    /**
     * Cerca una nota per titolo ed eventualmente la elimina.
     *
     * @param titolo il titolo della nota da eliminare
     * @return true se la nota è stata eliminata, false se non trovata
     */
    public boolean eliminaNotaPerTitolo(String titolo) {
        for (int i = 0; i < note.size(); i++) {
            if (note.get(i).getTitolo().equalsIgnoreCase(titolo)) {
                note.remove(i);
                salvaNoteSuFile();
                return true;
            }
        }
        return false;
    }

    /**
     * Salva tutte le note attualmente presenti su file.
     */
    private void salvaNoteSuFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Nota n : note) {
                writer.write("Titolo: " + n.getTitolo());
                writer.newLine();
                writer.write("Data: " + n.getData());
                writer.newLine();
                writer.write("Contenuto:");
                writer.newLine();
                writer.write(n.getContenuto());
                writer.newLine();
                writer.write("================");
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Errore nel salvataggio del file: " + e.getMessage());
        }
    }

    /**
     * Carica tutte le note dal file, se esiste già.
     */
    private void caricaNoteDaFile() {
        File file = new File(filePath);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String riga;
            while ((riga = reader.readLine()) != null) {
                if (riga.startsWith("Titolo: ")) {
                    String titolo = riga.substring(8).trim();
                    String data = reader.readLine().substring(6).trim();
                    reader.readLine();
                    StringBuilder contenutoBuilder = new StringBuilder();
                    while ((riga = reader.readLine()) != null && !riga.equals("===============")) {
                        contenutoBuilder.append(riga).append("\n");
                    }
                    String contenuto = contenutoBuilder.toString().trim();
                    note.add(new Nota(titolo, contenuto, data));
                }
            }
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file: " + e.getMessage());
        }
    }
}
