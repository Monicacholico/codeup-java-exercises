package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static boolean keepGoing() {
        System.out.println("Would you like to see another student (y/n)?");
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        // username as the key and email as the value


        Student studentgina = new Student ("Gina");
        studentgina.addGrade(9);
        studentgina.addGrade(10);
        studentgina.addGrade(7);

        Student studentjenn = new Student ("Jenn");
        studentjenn.addGrade(8);
        studentjenn.addGrade(9);
        studentjenn.addGrade(7);

        Student studentheather = new Student("Heather");
        studentheather.addGrade(9);
        studentheather.addGrade(10);
        studentheather.addGrade(9);

        Student studentemily = new Student("Emily");
        studentemily.addGrade(8);
        studentemily.addGrade(9);
        studentemily.addGrade(10);


        students.put("UserGina", studentgina);
        students.put("UserJenn", studentjenn);
        students.put("UserHeather", studentheather);
        students.put("UserEmily", studentemily);



        String Userchoice;


                System.out.println("Welcome!\n Here are the github usernames of our students :");
                for(Map.Entry<String, Student > entry: students.entrySet()){
                    System.out.println (" | " + entry.getKey() + " | \t");
                }

        do {
                System.out.println("What student would you like to see more information on?");
                Scanner input = new Scanner(System.in).useDelimiter("\n");
                Userchoice = input.next();

                if(Userchoice.equalsIgnoreCase("Usergina")){
                    System.out.println(studentgina.getName() + " got the following grades " + studentgina.getGrade() + " and has an average grade of " + students.get("UserGina").getGradeAverage());
                } else if (Userchoice.equalsIgnoreCase("UserHeather")){
                    System.out.println(studentheather.getName() + "got the following grades " + studentheather.getGrade() + " and has an average grade of " + students.get("UserHeather").getGradeAverage());
                } else if (Userchoice.equalsIgnoreCase("UserJenn")){
                    System.out.println(studentjenn.getName() + " got the following grades " + studentjenn.getGrade() + " and has an average of " + students.get("UserJenn").getGradeAverage()) ;
                } else if (Userchoice.equalsIgnoreCase("UserEmily")){
                    System.out.println(studentemily.getName() + " got the following grades " + studentemily.getGrade() + " and has an average of " + students.get("UserEmily").getGradeAverage());
                } else {
                    System.out.println("Sorry, no student found with the github username of '" + Userchoice + "'\n");
//                    System.out.println("Would you like to see another student (y/n?");
                }
        } while (keepGoing());

//        System.out.println("Would you like to see another student (y/n?");







//        System.out.println(studentjenn.getName() + " got the following grades " + studentjenn.getGrade()+ " and has an average grade of " + students.get("UserJenn").getGradeAverage());







//        students.put("Usergina", new Student ("Gina"));
//        students.put("UserJenn", new Student("Jenn"));
//        students.put("UserHeather", new Student("Heather"));
//        students.put("UserEmily", new Student("Emily"));
//
//        Student gina = students.get("Usergina");
//        gina.addGrade(9);
//        gina.addGrade(10);
//        gina.addGrade(7);
//
//        Student jenn = students.get("UserJenn");
//        jenn.addGrade(8);
//        jenn.addGrade(9);
//        jenn.addGrade(10);
//
//        Student Heather = students.get("UserHeather");
//        Heather.addGrade(9);
//        Heather.addGrade(10);
//        Heather.addGrade(9);
//
//        Student Emily = students.get("UserEmily");
//        Emily.addGrade(8);
//        Emily.addGrade(9);
//        Emily.addGrade(10);


//        System.out.println(students.get(gina));
    }



}

