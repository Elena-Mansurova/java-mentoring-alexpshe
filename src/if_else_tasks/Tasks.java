package if_else_tasks;

import java.sql.SQLOutput;

public class Tasks {

    public String checkParity(int number) {
        String parity = "Нечетное";
        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }

//    public void checkAge(int age) {
//        String ageDescription = "";
//        if (age < 18) {
//            ageDescription = "Несовершеннолетний";
//        } else if (age >= 18 && age <= 60) {
//            ageDescription = "Взрослый";
//        }
//    }

}
