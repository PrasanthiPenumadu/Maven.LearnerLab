package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    CHRIS(new Instructor(1l,"Chris")),
    DOLIO(new Instructor(2l,"Dolio")),
    WILHEM(new Instructor(3l,"Wilhem")),
    FROILAN(new Instructor(4l,"Froilan"));

    double timeWorked;
    final Instructor instructor;

    Educator(Instructor instructor) {
        this.instructor=instructor;
    }

    public void teach(Learner learner, double numberOfHours) {
    this.instructor.teach(learner, numberOfHours);
    timeWorked+=numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
     this.instructor.lecture(learners, numberOfHours);
        timeWorked+=numberOfHours;
    }
}
