import java.util.Objects;

/**
 * Rappresenta una singola nota del diario.
 *
 * @author Michel Massard
 * @version Giugno 2025
 */
public class Nota {
    private String titolo;
    private String contenuto;
    private String data;

    /**
     * Costruisce una nota con titolo, contenuto e data.
     *
     * @param titolo il titolo della nota
     * @param contenuto il contenuto testuale della nota
     * @param data la data della nota
     */
    public Nota(String titolo, String contenuto, String data) {
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.data = data;
    }

    /**
     * Restituisce il titolo della nota.
     *
     * @return il titolo
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Imposta un nuovo titolo.
     *
     * @param titolo il nuovo titolo
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * Restituisce il contenuto della nota.
     *
     * @return il contenuto
     */
    public String getContenuto() {
        return contenuto;
    }

    /**
     * Imposta un nuovo contenuto.
     *
     * @param contenuto il nuovo contenuto
     */
    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    /**
     * Restituisce la data della nota.
     *
     * @return la data
     */
    public String getData() {
        return data;
    }

    /**
     * Imposta una nuova data.
     *
     * @param data la nuova data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Restituisce una rappresentazione testuale della nota.
     *
     * @return una stringa con le informazioni della nota
     */
    @Override
    public String toString() {
        return "Titolo: " + titolo + "\nData: " + data + "\nContenuto:\n" + contenuto;
    }

    /**
     * Confronta due note.
     *
     * @param obj l'oggetto da confrontare
     * @return true se titolo e data sono uguali
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Nota nota = (Nota) obj;
        return titolo.equals(nota.titolo) && data.equals(nota.data);
    }

    /**
     * Restituisce un hash code basato su titolo e data.
     *
     * @return l'hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(titolo, data);
    }
}