package alishev.day12;

import javax.swing.plaf.SliderUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand musicBand1 = new MusicBand("1", 1990);
        MusicBand musicBand2 = new MusicBand("2", 1993);
        MusicBand musicBand3 = new MusicBand("3", 1996);
        MusicBand musicBand4 = new MusicBand("4", 1999);
        MusicBand musicBand5 = new MusicBand("5", 1992);
        MusicBand musicBand6 = new MusicBand("6", 2090);
        MusicBand musicBand7 = new MusicBand("7", 2990);
        MusicBand musicBand8 = new MusicBand("8", 3990);
        MusicBand musicBand9 = new MusicBand("9", 4990);
        MusicBand musicBand10 = new MusicBand("10", 5990);

        List<MusicBand> list = new ArrayList<>();
        list.add(musicBand1);
        list.add(musicBand2);
        list.add(musicBand3);
        list.add(musicBand4);
        list.add(musicBand5);
        list.add(musicBand6);
        list.add(musicBand7);
        list.add(musicBand8);
        list.add(musicBand9);
        list.add(musicBand10);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        List<MusicBand> bandAfter2000 = new ArrayList<>();

        for(MusicBand band : list){
            if(band.getYear() > 2000){
                bandAfter2000.add(band);
            }
        }

        System.out.println(bandAfter2000);

    }
}
