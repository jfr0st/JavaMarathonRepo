package day12.TaskNumber5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> bandOneList = new ArrayList<MusicArtist>();
        bandOneList.add(new MusicArtist("Ларс",37));
        bandOneList.add(new MusicArtist("Стив", 42));
        bandOneList.add(new MusicArtist("Айв",29 ));
        MusicBand band1 = new MusicBand("Metall", 1997,bandOneList);


        List<MusicArtist> bandTwoList = new ArrayList<MusicArtist>();
        bandTwoList.add(new MusicArtist("Джесс", 54));
        bandTwoList.add(new MusicArtist("Джо", 47));
        MusicBand band2 = new MusicBand("Iron", 2000,bandTwoList);

        union(band1,band2);
        stringArtist(band1);
        stringArtist(band2);



    }

    public static void union(MusicBand A, MusicBand B){
        for(int i = 0; i < A.getComposition().size(); i++){
            B.getComposition().add(A.getComposition().get(i));
            A.getComposition().remove(i);
            i -= 1;
        }
    }

    public static void stringArtist(MusicBand band){
        System.out.println(band.getComposition());
    }
}
