class Brano {
    private String titolo;
    private String autore;

    public Brano(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    @Override
    public String toString() {
        return titolo + " - " + autore;
    }
}
