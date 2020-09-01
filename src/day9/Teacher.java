package day9;

public class Teacher extends Human {

    String lessonName;

    public Teacher(String name, String lessonName) {
        super(name);
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public void printInfo(){
        System.out.println("Этот человек с именем " + super.getName());
        System.out.println("Этот перподаватель с именем " + super.getName());
    }
}

