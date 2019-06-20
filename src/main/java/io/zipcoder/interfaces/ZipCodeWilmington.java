package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    Students students=Students.getInstance();
    Instructors instructors=Instructors.getInstance();
    final static ZipCodeWilmington INSTANCE=new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher,double numberOfHours){
        teacher.lecture(students.getArray(),numberOfHours);
        }
    public void hostLecture(Long id,double numberOfHours){
        (instructors.findByID(id)).lecture(students.getArray(),numberOfHours);
    }
    public Map getStudyMap(){
        Map<Student,Double> sMap=new HashMap<Student, Double>();
        for(Person stu:students)
        sMap.put((Student)stu,((Student)stu).getTotalStudyTime());
        return sMap;
    }
}
