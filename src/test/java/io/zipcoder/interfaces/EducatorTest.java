package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {


    @Test
    public void testImplementation() {
       Educator educator= Educator.CHRIS;
        Assert.assertTrue(educator instanceof Teacher);
    }
    @Test
    public void teach() {
       // Educator.CHRIS;
        Student student=new Student();
        Educator.CHRIS.teach(student,45);
        Assert.assertEquals(45,student.getTotalStudyTime(), 0.0009);

    }

    @Test
    public void lecture() {
        Student student=new Student();
        Student student1=new Student();
        Learner[] learne={student,student1};
        Educator.CHRIS.lecture(learne,90);
        Assert.assertEquals(45, student.getTotalStudyTime(), 0.0009);

    }
}