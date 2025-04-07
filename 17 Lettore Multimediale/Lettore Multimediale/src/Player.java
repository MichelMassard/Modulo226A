class Player {
    private String modello;
    private String marca;
    private Playlist playlist;
    private int posizioneAttuale;

    public Player(String modello, String marca, Playlist playlist) {
        this.modello = modello;
        this.marca = marca;
        this.playlist = playlist;
        this.posizioneAttuale = 0;
    }


    public void Play() {
        Brano brano = playlist.getBrano(posizioneAttuale);
        if (brano != null) {
            System.out.println("Riproducendo: " + brano.getTitolo() + " di " + brano.getAutore() + " (Posizione: " + (posizioneAttuale + 1) + ")");
        } else {
            System.out.println("Nessun brano da riprodurre.");
        }
    }

    public void Successivo() {
        if (posizioneAttuale < playlist.getNumeroBrani() - 1) {
            posizioneAttuale++;
            Play();
        } else {
            System.out.println("Sei già all'ultimo brano della playlist.");
        }
    }

    public void Precedente() {
        if (posizioneAttuale > 0) {
            posizioneAttuale--;
            Play();
        } else {
            System.out.println("Sei già al primo brano della playlist.");
        }
    }

    public void SelezionaBrano(int n) {
        if (n >= 1 && n <= playlist.getNumeroBrani()) {
            posizioneAttuale = n - 1;
            Play();
        } else {
            System.out.println("Posizione non valida.");
        }
    }
}

