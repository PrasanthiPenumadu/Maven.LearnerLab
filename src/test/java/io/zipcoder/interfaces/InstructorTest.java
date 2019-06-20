package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {


    @Test
    public void testImplementation() {
       Instructor instructor=new Instructor();
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance() {
        Instructor instructor=new Instructor();
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor=new Instructor();
        Student student=new Student();
        instructor.teach(student,45);
        Assert.assertEquals(45,student.getTotalStudyTime(), 0.0009);
    }

    @Test
    public void lecture() {
        Student student=new Student();
        Student student1=new Student();
        Learner[] learne={student,student1};
        Instructor instructor=new Instructor();
        instructor.lecture(learne,90);
        Assert.assertEquals(45, student.getTotalStudyTime(), 0.0009);
    }
    @Test
    public void lecture1() {
        Student student=new Student();
        Student student1=new Student();
        Learner[] learne={student,student1};
        Instructor instructor=new Instructor();
        instructor.lecture(learne,90);
        Assert.assertNotEquals(30, student.getTotalStudyTime(), 0.0009);
    }

}