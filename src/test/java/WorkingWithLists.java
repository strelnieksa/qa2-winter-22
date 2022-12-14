import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithLists() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastName("The Tester");
        valera.setEmail("valerunchik@test.lv");
        valera.setPhone("+37123454327");

        Student liga = new Student("Līga", "Ivanova", "liga@test.lv", "+3717100335677");
        Student dimko = new Student("Dimko", "Skatinishe", "omg@test.lv", "+37102");
        Student artis = new Student("Artis", "Greatest", "", "11236");

        liga.setLastName("Zvaigzne");

        List<Student> students = new ArrayList<>();
        students.add(valera);    //0
        students.add(liga);      //1
        students.add(dimko);     //2
        students.add(artis);     //3

        //-------------------------FOR------------------------------
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getFirstName());
        }

        System.out.println();
        //=======================FOREACH-------------------------

        for (Student s :students){
     //       System.out.println(s.getFirstName() + " " + s.getLastName());
            System.out.println(s.getFullName());
        }

        System.out.println();
        // -------------------------------FOREACH with IF---------------------
        System.out.println("Print Out Latvian Numbers +371");
        for (Student s :students){
            if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFullName());
            }

        }

    }
}
