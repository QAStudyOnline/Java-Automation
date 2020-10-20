package online.qastudy.lesson1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LessonOneTutor automationTutor = new LessonOneTutor("Yehor");
        LessonOneStudent studentFirst = new LessonOneStudent("Olga");
        LessonOneStudent studentSecond = new LessonOneStudent("Oleg");

        LessonOneGroup automationJava =
                new LessonOneGroup(
                        "Java Automation",
                        automationTutor,
                        new LessonOneStudent[]{studentFirst, studentSecond}
                        );

        for (int i = 0; i < automationJava.getStudents().length; i++) {
            System.out.println(automationJava.getStudents()[i].getStudentName());
        }

        new Random().nextInt();
        automationJava.getStudents()[0].askQuestion("What is Java?");
        automationJava.getTutor().writeAnswer("What is Java?");
        automationJava.getStudents()[0].readAnswer();
    }
}
