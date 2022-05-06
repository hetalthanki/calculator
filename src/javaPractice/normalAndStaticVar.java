/**
 * program that demonstrate normal declaration and static declaration of variables
 */
package javaPractice;

import java.sql.SQLOutput;

public class normalAndStaticVar {
   int rno;          //instance variavle
    double per;
    String name;
    static String course="Computer Engineering";

    public void insertData(int rno, double per, String name)
    {
        this.rno = rno;
        this.per = per;
        this.name = name;

    }

    public void displayData()
    {
        System.out.println("Roll Number:"+rno + " Name:"+name);
    }

    public void displatCourseNmae()
    {
        System.out.println("course name:"+course);
    }

    public static void changeCourseName()
    {

    }

    public static void main(String[] args) {
        normalAndStaticVar s1 = new normalAndStaticVar();
        normalAndStaticVar s2 = new normalAndStaticVar();

        //insert data
        s1.insertData(1,88.88,"hetal");
        s2.insertData(2,99.99,"jigar");

        //display data
        s1.displayData();
        s2.displayData();

        //course name for student 1
        System.out.println("course name for student 1");
        s1.displatCourseNmae();

        //course name for student 2
        System.out.println("course name for student 2");
        s2.displatCourseNmae();

        //change course name




    }
}
