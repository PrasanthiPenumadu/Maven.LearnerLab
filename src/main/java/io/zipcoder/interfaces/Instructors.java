package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    final static Instructors INSTANCE=new Instructors();

    private Instructors(){
        super();
        add(Educator.CHRIS.instructor);
        add(Educator.DOLIO.instructor);
        Instructor instructor3=new Instructor(3l,"Wilhem");
       add(Educator.WILHEM.instructor);
        Instructor instructor4=new Instructor(4l,"Froilan");
        add(Educator.FROILAN.instructor);
    }

    public Instructor[] getArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
