package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        String name="Prasanthi";
        Long id=123l;
        Person p=new Person(id, name);
        String retrievedName=p.getName();
        Long retrieveId=p.getId();
        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(id, retrieveId);
    }

    @Test
    public void testId() {
        Person p=new Person(123l, "Prasanthi");
        Assert.assertEquals(123l, p.getId(),0.0001);
    }
    @Test
    public void testName1() {
        Person p=new Person(123l, "Prasanthi");
        Assert.assertEquals("Prasanthi", p.getName());
    }
    @Test
    public void testName2() {
        Person p=new Person(123l, "Prasanthi");
        Assert.assertNotEquals(123l, p.getName());
    }
    @Test
    public void testSetName() {
        Person p=new Person(123l, "Prasanthi");
        p.setName("Lakshmi");
        Assert.assertEquals("Lakshmi", p.getName());
    }

}
