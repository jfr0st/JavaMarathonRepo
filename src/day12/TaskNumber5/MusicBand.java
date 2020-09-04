package day12.TaskNumber5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> composition;

    public MusicBand(String name, int year, List<MusicArtist> composition) {
        this.name = name;
        this.year = year;
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getComposition() {
        return composition;
    }

    public void setComposition(List<MusicArtist> composition) {
        this.composition = composition;
    }

    @Override
    public String toString(){
       return getName() + " - " + getYear();
    }
}
