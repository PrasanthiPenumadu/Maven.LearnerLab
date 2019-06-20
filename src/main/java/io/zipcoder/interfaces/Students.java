package io.zipcoder.interfaces;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.ArrayList;
import java.util.List;

public class Students extends People<Student>{
    final static Students INSTANCE=new Students();

    private Students() {
        super();
        Student student1=new Student(123l,"Student1");
        super.add(student1);
        Student student2=new Student(125l,"Student2");
        super.add(student2);
        Student student3=new Student(127l,"Student3");
        super.add(student3);
    }
    @Override
    public Student[] getArray() {//personList.toArray(new E[personList.size()]);
        return personList.toArray(new Student[personList.size()]);
    }

    public static Students getInstance(){ return INSTANCE; }
}
