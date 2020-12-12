package com.pomi.forthlabs.firsttask;

import java.util.LinkedList;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Name:" + name + ", "+ course+" course";
    }

    public static void printStudent(LinkedList<Student> students, int course){
        System.out.println("Students of "+course+" course:");
        for (Student student : students) {
            if (student.course ==course){
                System.out.println(student.name);
            }
        }
    }
    public static LinkedList<Student> union(LinkedList<Student> set1, LinkedList<Student> set2){
        LinkedList<Student> result = new LinkedList<Student>(set1);
        for (Student student : set2) {
            if(!result.contains(student)){
                result.add(student);
            }
        }
        return result;
    }
    public static LinkedList<Student> intersect(LinkedList<Student> set1, LinkedList<Student> set2){
        LinkedList<Student> result = new LinkedList<Student>();
        for (Student student : set1) {
            if (set2.contains(student)){
                result.add(student);
            }
        }
        return result;
    }
    public static void show(LinkedList<Student> students){
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                name.equals(student.name);
    }


    public int compareTo(Student o) {
        if(course==o.course){
            return -1;
        }
        return course - o.course;
    }

    public static void main(String[] args) {
        LinkedList<Student> studentsFirst = new LinkedList<Student>();
        studentsFirst.add(new Student("Alex Micher",3));
        studentsFirst.add(new Student("Petr Fedotov",3));
        studentsFirst.add(new Student("Kostya Ivanov",1));
        studentsFirst.add(new Student("Ivan Hitrov",1));
        studentsFirst.add(new Student("Sidr Sidorov",2));
        studentsFirst.add(new Student("Sergey Makeev",2));
        studentsFirst.add(new Student("Mixail Panamarev",4));
        studentsFirst.add(new Student("Andrey Kisljk",4));
        LinkedList<Student> studentsSecond = new LinkedList<Student>();
        studentsSecond.add(new Student("Alex Micher",3));
        studentsSecond.add(new Student("Petr Ivanov",3));
        studentsSecond.add(new Student("Petr Ivanov",1));
        studentsSecond.add(new Student("Ivan Sidarov",1));
        studentsSecond.add(new Student("Sidr Sidorov",2));
        studentsSecond.add(new Student("Sergey Smirnov",2));
        studentsSecond.add(new Student("Mixail Panamarev",4));
        studentsSecond.add(new Student("Andrey Drobot",4));
        Student.printStudent(studentsFirst,3);
        LinkedList<Student> studentsFromUnion = Student.union(studentsFirst,studentsSecond);
        System.out.println("Студенты объединения:");
        Student.show(studentsFromUnion);
        LinkedList<Student> studentsFromIntersect = Student.intersect(studentsFirst,studentsSecond);
        System.out.println("Студенты пересечения:");
        Student.show(studentsFromIntersect);
        TreeSet<Student> students = new TreeSet<Student>();
        students.add(new Student("Alex Micher",3));
        students.add(new Student("Petr Petrov",3));
        students.add(new Student("Petr Ivanov",1));
        students.add(new Student("Ivan Ivanov",1));
        students.add(new Student("Sidr Sidorov",2));
        students.add(new Student("Sergey Makeev",2));
        students.add(new Student("Mixail Panamarev",4));
        students.add(new Student("Andrey Kisljk",4));
        System.out.println(students);

    }
}