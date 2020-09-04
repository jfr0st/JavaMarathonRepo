package day12.TaskNumber3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> myMisicList = new ArrayList<MusicBand>();
        List<MusicBand> myMisicOver = new ArrayList<MusicBand>();

        MusicBand band1 = new MusicBand("Metallica",1981);
        MusicBand band2 = new MusicBand("Iron Maiden",1980);
        MusicBand band3 = new MusicBand("Black Sabbath",1968);
        MusicBand band4 = new MusicBand("Korn",1993);
        MusicBand band5 = new MusicBand("Deathklok",1997);
        MusicBand band6 = new MusicBand("Five Finger Death Punch",2005);
        MusicBand band7 = new MusicBand("Volbeat",2001);
        MusicBand band8 = new MusicBand("Havok",2004);
        MusicBand band9 = new MusicBand("Pendulum",2002);
        MusicBand band10 = new MusicBand("Blessthefall",2003);

        myMisicList.add(band1);
        myMisicList.add(band2);
        myMisicList.add(band3);
        myMisicList.add(band4);
        myMisicList.add(band5);
        myMisicList.add(band6);
        myMisicList.add(band7);
        myMisicList.add(band8);
        myMisicList.add(band9);
        myMisicList.add(band10);

        System.out.println("Исходный массив: ");
        for(MusicBand music : myMisicList){
            System.out.println(music);
        }

        System.out.println();
        Collections.shuffle(myMisicList);

        System.out.println("Перемешанный исходный массив: ");
        for(MusicBand music : myMisicList){
            System.out.println(music);
        }

        System.out.println();

        for(int i = 0;i < myMisicList.size();i++){
            if(myMisicList.get(i).getYear() >= 2000){
                myMisicOver.add(myMisicList.get(i));
            }
        }

        System.out.println("Группы появившиеся полсе 2000 года: ");
        for(MusicBand music : myMisicOver){
            System.out.println(music);
        }
    }
}
