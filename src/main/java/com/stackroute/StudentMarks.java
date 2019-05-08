/*Create a class called StudentMarks, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message.*/

package com.stackroute;

import java.util.Scanner;

public class StudentMarks {

    int numOfStudents, stuGrade[];
    Scanner input=new Scanner(System.in);

    public void grade()
    {
        System.out.println("enter number of students \n");
        numOfStudents=input.nextInt();
        stuGrade=new int[numOfStudents];
        for(int i=0; i<numOfStudents;i++)
        {
            System.out.println("Enter grade for student "+ (i+1));
            stuGrade[i]=input.nextInt();
            if(stuGrade[i]<0 || stuGrade[i]>100)
            {
                System.out.println("ERROR!!! \n Enter grade between 0-100");
            }

        }
    }

    public static void main(String[] args)
    {
        StudentMarks s=new StudentMarks();
        s.grade();
    }


}

