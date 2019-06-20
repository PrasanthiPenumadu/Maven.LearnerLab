package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void add() {
        Person person=new Person();
        Person person1=new Person();
        List<Person> personList=new ArrayList<Person>();
        personList.add(person);
        personList.add(person1);
        Assert.assertEquals(2,personList.size());
    }

    @Test
    public void findByID() {
        Instructor instructor9=new Instructor(138l,"Dan");
        People people = Instructors.getInstance();
        people.add(instructor9);

        Assert.assertEquals(instructor9, people.findByID(138l));
    }



    @Test
    public void contains() {
        Person person=new Person();
        Person person1=new Person();
        List<Person> personList=new ArrayList<Person>();
        personList.add(person);
        personList.add(person1);
        Assert.assertTrue(personList.contains(person));
    }

    @Test
    public void remove() {
        Person person=new Person();
        Person person1=new Person();
        List<Person> personList=new ArrayList<Person>();
        personList.add(person);
        personList.add(person1);
        personList.remove(person);
        Assert.assertFalse(personList.contains(person));
    }

    @Test
    public void removeById() {
    }

    @Test
    public void removeAll() {
    }

    @Test
    public void count() {
        Person person=new Person();
        Person person1=new Person();
        List<Person> personList=new ArrayList<Person>();
        personList.add(person);
        personList.add(person1);
        Assert.assertEquals(2, personList.size());
    }


}