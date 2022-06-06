package alishev.day12;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("A");
        members1.add("B");

        MusicBand band1 = new MusicBand("C1", 1965, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("C");
        members2.add("D");

        MusicBand band2 = new MusicBand("C2", 1965, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}
