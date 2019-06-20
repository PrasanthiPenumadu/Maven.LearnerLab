package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation() {
        Student student=new Student();
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance() {
        Student student=new Student();
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student=new Student();
        student.learn(45);
        Assert.assertEquals(45, student.getTotalStudyTime(), 0.0009);
    }

    @Test
    public void getTotalStudyTime() {
        Student student=new Student();
        student.learn(98);
        Assert.assertNotEquals(45, student.getTotalStudyTime(), 0.0009);

    }
}