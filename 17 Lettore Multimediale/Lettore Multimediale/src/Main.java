//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist("Skibidi");
        playlist.aggiungiBrano(new Brano("Palleggio di testa", "JANO"));
        playlist.aggiungiBrano(new Brano("Wassup Beijing", "Xi Jinping"));
        playlist.aggiungiBrano(new Brano("Film di minecraft", "Lazza"));

        Player player = new Player("OP416", "Opera", playlist);

        player.Play();
        player.Successivo();
        player.SelezionaBrano(1);
        player.Successivo();
        player.Successivo();
    }
}