package day12.TaskNumber4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> metalicaGroup = new ArrayList<String>();
        metalicaGroup.add("Джеймс");
        metalicaGroup.add("Ларс");
        metalicaGroup.add("Кирк");
        metalicaGroup.add("Роберт");
        MusicBand band1 = new MusicBand("Metallica",1981,metalicaGroup);

        List<String> ironGroup = new ArrayList<String>();
        ironGroup.add("Стив");
        ironGroup.add("Дэйв");
        ironGroup.add("Адриан");
        ironGroup.add("Брюс");
        ironGroup.add("Нико");
        ironGroup.add("Янис");
        MusicBand band2 = new MusicBand("Iron Maiden",1980,ironGroup);

        merger(band1,band2);
        stringComposition(band1);
        stringComposition(band2);



    }

    public static void merger(MusicBand A,MusicBand B){
        for(int i = 0;i < A.getComposition().size();i++){
            B.getComposition().add(A.getComposition().get(i));
            A.getComposition().remove(i);
            i -= 1;
        }
    }

    public static void stringComposition(MusicBand band){
        System.out.println(band.getComposition());
    }
}
