package org.example;

public class Validator {
    public boolean validateAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Invalid age!");
        }
        return age>=18;
    }
}
