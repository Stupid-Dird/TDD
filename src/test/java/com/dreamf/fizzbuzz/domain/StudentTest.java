package com.dreamf.fizzbuzz.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentTest {


    @Test
    public void studentSayNumberIsMultipleThree(){
        proxyTeacherRollCall(3, "Fizz");
    }

    @Test
    public void studentSayNumberIsContainingElementThree(){
        proxyTeacherRollCall(23, "Fizz");
    }

    @Test
    public void studentSayNumberIsMultipleFive(){
        proxyTeacherRollCall(5, "Buzz");
    }

    @Test
    public void studentSayNumberIsContainingElementFive(){
        proxyTeacherRollCall(52, "Buzz");
    }

    @Test
    public void studentSayNumberIsMultipleThreeAndFive(){
        proxyTeacherRollCall(15, "FizzBuzz");
    }

    @Test
    public void studentSayNumberNotIsMultipleThreeAndFive(){
        proxyTeacherRollCall(1,"1");
    }
    public void proxyTeacherRollCall(int number,String code){
        Student student = Student.getStudent(number);
        String studentCode = student.sayCode();
        Assert.assertEquals(studentCode, code);
    }
}
