package online.qastudy.lesson1;

import java.util.Scanner;

public class LessonOneGroup {
    private String groupName;
    private LessonOneStudent[] students;
    private LessonOneTutor tutor;

    public LessonOneTutor getTutor() {
        return tutor;
    }

    public void setTutor(LessonOneTutor tutor) {
        this.tutor = tutor;
    }

    public LessonOneStudent[] getStudents() {
        return students;
    }

    public void setStudents(LessonOneStudent[] students) {
        this.students = students;
    }

    public LessonOneGroup() {

    }

    public LessonOneGroup(String groupName,  LessonOneTutor tutor) {
        this.groupName = groupName;
    }

    public LessonOneGroup(String groupName,  LessonOneTutor tutor, LessonOneStudent [] students) {
        this.groupName = groupName;
    }
    public LessonOneGroup(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
