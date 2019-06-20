package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    double totalStudyTime;
    public Student(){}
    public Student(Long id,String Name){super(id,Name);}
    public void learn(double numberOfHours) {
    totalStudyTime=totalStudyTime+numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
