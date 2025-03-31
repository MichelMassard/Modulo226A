public class Prodotto {
    private String nome;
    private int codice;
    private int prezzo;
    private int quantitaMagazzino;



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getQuantitaMagazzino() {
        return quantitaMagazzino;
    }

    public void setQuantitaMagazzino(int quantitaMagazzino) {
        this.quantitaMagazzino = quantitaMagazzino;
    }

    public void aggiornaQuantita(int Qt){
        if (this.getQuantitaMagazzino() > Qt){
            System.out.println("Errore: No negativo");
        } else {
            this.quantitaMagazzino -= Qt;
        }
    }

    public void calcolaValoreTotale(int prezzo){}
}
