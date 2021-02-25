package miniprojects;
import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Motive");
        desertIslandPlaylist.add("Drops of Jupiter");
        desertIslandPlaylist.add("Body");
        desertIslandPlaylist.add("Halo");
        desertIslandPlaylist.add("Line by Line");
        desertIslandPlaylist.add("Motivation");

        System.out.println(desertIslandPlaylist.toString());
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove(5);

        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist.toString());

        int idxA = desertIslandPlaylist.indexOf("Body");
        int idxB = desertIslandPlaylist.indexOf("Motive");
        String a = desertIslandPlaylist.get(idxA);
        String b = desertIslandPlaylist.get(idxB);
        desertIslandPlaylist.set(idxA, b);
        desertIslandPlaylist.set(idxB, a);
        System.out.println(desertIslandPlaylist.toString());

    }
}
