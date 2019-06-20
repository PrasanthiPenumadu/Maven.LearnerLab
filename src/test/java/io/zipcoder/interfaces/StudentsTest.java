package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstance() {
    Students students=Students.getInstance();
        Assert.assertEquals(false,students.contains(students.findByID(899l)));
    }

    @Test
    public void getInstance1() {
        Students students=Students.getInstance();
        Assert.assertEquals(true,students.contains(students.findByID(123l)));
    }

}