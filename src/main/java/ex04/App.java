package ex04;

import ex04.teacher.HTMLTeacher;
import ex04.teacher.JavaTeacher;
import ex04.teacher.PythonTeacher;
import ex04.teacher.Teacher;

public class App {
    public static void main(String[] args) {

        Teacher jt = new JavaTeacher();
        Teacher pt = new PythonTeacher();
        Teacher ht = new HTMLTeacher();

        jt.수업하기();
        pt.수업하기();
        ht.수업하기();
    }
}
