package patterns.creative.factory;
public class Driver {
    public static void main(String[] args) {
        //Factory
        Music song = new Music.MusicBuilder().addGuitar().addDrum().addPiano().build();
        System.out.println(song.toString());
    }
}
