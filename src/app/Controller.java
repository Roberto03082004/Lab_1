//=============================================================================
// PROGRAMMER: Roberto Callejas
// PANTHER ID: 6360177
//
// CLASS: COP2210
// SECTION: U02C
// SEMESTER: Summer 2023
// CLASSTIME: 10:00 AM - 12:50 PM
//
// Project: Lab 1
// DUE: May 14, 2023 @ 11:59 PM
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
//                                          own and that none of it is the work of any other person.
//=============================================================================

package app;

public class Controller {

    public static void main(String[] args){

        System.out.println("COP 2210");

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("First Program Header 1");
        System.out.println("-----------------------------------");
        System.out.println("School: \t\t\t\t FIU");
        System.out.println("Major: \t\t\t\t\t ECON");
        System.out.print("Number of Students: \t 1000 \n");

        //------------------------------------------------------
        String school = "FIU";
        String major = "ECON";
        int numberOfStudents = 1000;

        System.out.println("\n");
        System.out.println("-----------------------------------");
        System.out.println("First Program Header 2");
        System.out.println("-----------------------------------");
        System.out.println("School: \t\t\t\t" + school);
        System.out.println("Major: \t\t\t\t\t" + major);
        System.out.println("Number of Students: \t" + numberOfStudents + "\n");

        System.out.println();
        System.out.println("Information->" + school + ":" + major + ":" + numberOfStudents);

        //------------------------------------------------------

        System.out.println("\n");
        System.out.println("-----------------------------------");
        System.out.println("First Program Header 3");
        System.out.println("-----------------------------------");
        System.out.printf("School: \t\t\t\t %-10s \n", school);
        System.out.printf("Major: \t\t\t\t\t %-6s \n", major);
        System.out.printf("Number of Students: \t %4d \n", numberOfStudents);

        System.out.println();
        System.out.printf("Information-> %-3s:%4s:%4d", school, major, numberOfStudents);

        System.out.println("\n\n");



    }

}// end Controller
