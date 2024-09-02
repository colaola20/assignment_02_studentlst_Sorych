package com.mycompany.studentlst;

import java.util.Scanner;

/**
 * @author MoaathAlrajab
 */
public class StudentLst {

    public static void main(String[] args) {
        Student[] students= new Student[2];
        Scanner inScanner = new Scanner(System.in);

        for(int i=0; i< students.length;i++){
            System.out.print("Enter student's name: ");
            String name = inScanner.nextLine();
            Student student = new Student(name);

            students[i]= student;

        }
        System.out.println(printOutput(students));
    }

    public static String printOutput(Student[] students){
        String str="";

        //To Do 03: complete the implementation of this method
         /*
         * for loop iterates through the students array and appends the student's name to String str using get method.
         * @return String str
         */
        for(int i=0; i<students.length;i++) {
            str += (i+1) + ". " + students[i].getName() + ", ";
        }
        return str + "\b\b";
    }


}
