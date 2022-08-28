package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static Scanner sc =  new Scanner(System.in);
    static Pattern string = Pattern.compile("^[A-Z][a-z]{3,}$");
    static Pattern email = Pattern.compile("^[a-z+.]+@(.+)$");
    static Pattern mobile = Pattern.compile("^[0-9]{1,2}[0-9]{10}$");
    static Pattern password1 = Pattern.compile("^.{8,}$");
    static Pattern password2 = Pattern.compile("^(?=.*[A-Z]).{8,}$");
    static Pattern password3 = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z]).{8,}$");

    public static void main(String[] args) {
        System.out.println("Enter your first name:- ");
        String firstName = sc.next();
        System.out.println("Enter your last name:- ");
        String lastName = sc.next();
        System.out.println("Enter a valid email \n eg:- abc.xyz@bl.co.in");
        String emailValid = sc.next();
        System.out.println("Enter a Valid Mobile Number:- ");
        String mobileNo = sc.next();
        System.out.println("Enter password1");
        String pass1 = sc.next();
        System.out.println("Enter password2");
        String pass2 = sc.next();
        System.out.println("Enter password3");
        String pass3 = sc.next();

        Matcher matchFirstName = string.matcher(firstName);
        Matcher matchLastName = string.matcher(lastName);
        if(matchFirstName.matches() && matchLastName.matches()){
            System.out.println("Valid Name");
        }
        else{
            System.out.println("Invalid Name ! \n First letter should be capital only and other should be in small");
        }
        Matcher matchEmail = email.matcher(emailValid);
        if(matchEmail.matches()){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }
        Matcher matchNum = mobile.matcher(mobileNo);
        if (matchNum.matches()){
            System.out.println("Valid Mobile Number");
        }
        else {
            System.out.println("Invalid Mobile Number");
        }
        Matcher matchPassword = password1.matcher(pass1);
        Matcher matchPassword2 = password2.matcher(pass2);
        Matcher matchPassword3 = password3.matcher(pass3);
        if (matchPassword.matches() | matchPassword2.matches() | matchPassword3.matches()){
            System.out.println("valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }

}