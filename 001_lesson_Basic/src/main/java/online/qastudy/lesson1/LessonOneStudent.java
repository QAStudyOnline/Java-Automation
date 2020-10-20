package online.qastudy.lesson1;

import java.util.Scanner;

public class LessonOneStudent {
    String studentName;

    public LessonOneStudent() {
    }

    public LessonOneStudent(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void riseHand(){
        System.out.println(" !!!!! ");
    }

    public void askQuestion(String question){
        System.out.println(question);
    }

    public String readAnswer(){
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        while (scanner.hasNext()) {
            answer = scanner.nextLine();
        }
        scanner.close();
        return answer;
    }

    public int passExam(){
        if (useCheetSuccess()){
            return 5;
        }else return 2;
    }

    private boolean useCheetSuccess() {
        return true;
    }
}
