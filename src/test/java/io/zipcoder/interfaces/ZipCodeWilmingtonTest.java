package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {


    @Test
    public void hostLecture() {
    ZipCodeWilmington zcw=ZipCodeWilmington.getInstance();
     //Instructor instructor= (Instructor) Instructors.getInstance().findByID(1l);
    Students stu=Students.getInstance();
    Student student=stu.findByID(125l);
        zcw.hostLecture(Educator.CHRIS, 90);
        Assert.assertEquals(30.0, zcw.getStudyMap().get(student));
    }

}