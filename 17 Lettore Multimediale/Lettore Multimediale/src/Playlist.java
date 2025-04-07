public class Playlist {
        private String titolo;
        private Brano[] brani;
        private int numeroBrani;

        public Playlist(String titolo) {
            this.titolo = titolo;
            this.brani = new Brano[100];  // Limitato a 100 brani per esempio
            this.numeroBrani = 0;
        }

        public void aggiungiBrano(Brano brano) {
            if (numeroBrani < brani.length) {
                brani[numeroBrani++] = brano;
            } else {
                System.out.println("Playlist piena!");
            }
        }

        public void rimuoviBrano(Brano brano) {
            for (int i = 0; i < numeroBrani; i++) {
                if (brani[i].equals(brano)) {
                    for (int j = i; j < numeroBrani - 1; j++) {
                        brani[j] = brani[j + 1];
                    }
                    brani[--numeroBrani] = null;
                    return;
                }
            }
        }

        public Brano getBrano(int n) {
            if (n >= 0 && n < numeroBrani) {
                return brani[n];
            }
            return null;
        }

        public int getNumeroBrani() {
            return numeroBrani;
        }
}
