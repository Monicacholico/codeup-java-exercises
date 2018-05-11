package grades;

import java.sql.Array;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(){}

    public Student(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addGrade (int grade){
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrade(){
        return grades;
    }

    public double getGradeAverage() {
        double Average = 0;
        int Total = 0;
        for (int i = 0; i < grades.size(); i++) {
            Total += grades.get(i);

        } return Average = Total / grades.size();

//        public String toString(){
//            return String.format(name + " have grades " + grades.addAll());
//        }
    }


    public static void main(String[] args) {


        Student student = new Student("Jason");
        student.addGrade(9);
        student.addGrade(10);
        student.addGrade(8);
        student.addGrade(6);

        Student student1 = new Student ("Heather");
        student1.addGrade(8);
        student1.addGrade(9);
        student1.addGrade(10);
        student1.addGrade(7);



        System.out.println("The grades for " + student.name + " are " + student.grades + "and the Average is " + student.getGradeAverage() );
    }


}
