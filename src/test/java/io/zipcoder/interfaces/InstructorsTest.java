package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstance() {
        Instructors instructors=Instructors.getInstance();
        Assert.assertEquals(4, instructors.count());
    }
    @Test
    public void getInstance1() {
        Instructors instructors=Instructors.getInstance();
        Assert.assertEquals(true, instructors.contains(instructors.findByID(1l)));
    }

}