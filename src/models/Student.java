package models;

import utilities.DBUtility;

import java.time.LocalDate;
import java.util.TreeMap;

public class Student extends Person{
    private int studentNum;
    private TreeMap<String, Integer> grades;

    public Student(String firstName, String lastName, String address, LocalDate birthday, int studentNum) {
        super(firstName, lastName, address, birthday);
        setStudentNum(studentNum);
        grades = new TreeMap<>();
    }

    public int getStudentNum() {
        return studentNum;
    }

    private void setStudentNum(int studentNum) {
        if (studentNum>=100000000)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("student number must be greater than 100000000");
    }

    public TreeMap<String, Integer> getGrades() {
        return grades;
    }

    public void addGrade(String courseCRN, int grade)
    {
        if (!DBUtility.validCRN((courseCRN)))
            throw new IllegalArgumentException("course crn not found");

        if(grade>=0 && grade<=100)
            grades.put(courseCRN, grade);

        else{
            throw new IllegalArgumentException("grade must be between 0- 100");
        }
    }

    public int getGradeForCourse(String crn){
        if (grades.get(crn) == null){
            return -1;
        }
        return grades.get(crn);
    }
}