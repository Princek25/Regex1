package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static Scanner sc =  new Scanner(System.in);
    static Pattern string = Pattern.compile("^[A-Z][a-z]{3,}$");
    static Pattern email = Pattern.compile("^[a-z+.]+@(.+)$");

    public static void main(String[] args) {
        System.out.println("Enter your first name:- ");
        String firstName = sc.next();
        System.out.println("Enter your last name:- ");
        String lastName = sc.next();
        System.out.println("Enter a valid email \n eg:- abc.xyz@bl.co.in");
        String emailValid = sc.next();

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
    }

}