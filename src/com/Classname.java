package com;
import java.util.Scanner;


public class Classname {

    public void methodname(){
        Scanner s_name = new Scanner(System.in);	//Scanner declaration
        //Use Scanner object to take input
        int val1    =  s_name.nextInt();			//int
        float val2  =  s_name.nextFloat();			//float
        double val3 =  s_name.nextDouble();			//double
        string name =  s_name.nextLine();			//string
        char ch     =  s_name.nextLine().charAt(0);	//character
    }


}
