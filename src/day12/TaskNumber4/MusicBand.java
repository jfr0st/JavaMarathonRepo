package day12.TaskNumber4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> composition;

    public MusicBand(String name, int year, List<String> composition) {
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

    public List<String> getComposition() {
        return composition;
    }

    public void setComposition(List<String> composition) {
        this.composition = composition;
    }

    @Override
    public String toString(){
       return getName() + " - " + getYear();
    }
}
