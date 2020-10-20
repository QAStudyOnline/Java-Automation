package online.qastudy.lesson1;

import java.util.Scanner;

public class LessonOneTutor {
    private String tutorName;

    public LessonOneTutor() {
    }

    public LessonOneTutor(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public void writeAnswer(String question){
        System.out.println("Question is:" +question);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an answer:");
        String answer = scanner.nextLine();
        scanner.close();
        System.out.println(answer);
    }
}
