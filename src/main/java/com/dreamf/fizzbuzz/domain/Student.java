package com.dreamf.fizzbuzz.domain;



public class Student {

    private int number;


    public String sayCode() {
        if (isTheNumberAMultipleOfDivisor(3)&& isTheNumberAMultipleOfDivisor(5)) {
            return "FizzBuzz";
        }
        if (isTheNumberAMultipleOfDivisor(3)||isElementInANumber(3)) {
            return "Fizz";
        }
        if (isTheNumberAMultipleOfDivisor(5) || isElementInANumber(5)) {
            return "Buzz";
        }
        return number+"";
    }

    private boolean isTheNumberAMultipleOfDivisor(int divisor){
        if(number%divisor==0){
            return true;
        }
        return false;
    }

    private boolean isElementInANumber(int element) {
        for(int i=number;i>0;i/=10){
            if(i%10==element){
                return true;
            }
        }
        return false;
    }


    public static Student getStudent(int number) {
        Student student = new Student();
        student.number = number;
        return student;
    }
}
