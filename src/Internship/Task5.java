package Internship;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course {
    String code;
    String title;
    String description;
    int capacity;
    String schedule;

    Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }
}

class Student {
    String studentID;
    String name;
    List<String> registeredCourses;

    Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }
}

public class Task5 {
    List<Course> courses;
    List<Student> students;

    public Task5() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void registerStudent(Student student, String courseCode) {
        for (Course course : courses) {
            if (course.code.equals(courseCode)) {
                if (course.capacity > 0) {
                    course.capacity--;
                    student.registeredCourses.add(courseCode);
                    System.out.println(student.name + " has successfully registered for " + course.title);
                } else {
                    System.out.println("Sorry, " + course.title + " is full.");
                }
                return;
            }
        }
        System.out.println("Course with code " + courseCode + " not found.");
    }

    public void removeCourse(Student student, String courseCode) {
        if (student.registeredCourses.contains(courseCode)) {
            student.registeredCourses.remove(courseCode);
            for (Course course : courses) {
                if (course.code.equals(courseCode)) {
                    course.capacity++;
                    System.out.println(student.name + " has successfully dropped " + course.title);
                    return;
                }
            }
        }
        System.out.println("Course with code " + courseCode + " not found in registered courses of " + student.name);
    }

    public void displayAvailableCourses() {
        System.out.println("------------------------------------------");
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println("Code: " + course.code);
            System.out.println("Title: " + course.title);
            System.out.println("Description: " + course.description);
            System.out.println("Capacity: " + course.capacity + " slots available out of " + course.capacity);
            System.out.println("Schedule: " + course.schedule);
            System.out.println("--------------------------------------");
        }
    }

    public static void main(String[] args) {
        Task5 registrationSystem = new Task5();
        // Adding sample courses
        Course computers = new Course("CS001", "Introduction to Computer Science", "Basic concepts of programming", 30, "Mon/Wed/Fri 9-11 AM");
        Course math = new Course("MATH001", "Calculus", "Fundamental principles of calculus", 25, "Tue/Thu 1-3 PM");
        registrationSystem.addCourse(computers);
        registrationSystem.addCourse(math);

        // Sample student registration
        Student student1 = new Student("S001", "Nagaumesh");
        Student student2 = new Student("S002", "Saketha");

        registrationSystem.registerStudent(student1, "CS001");
        registrationSystem.registerStudent(student1, "MATH001");
        registrationSystem.registerStudent(student2, "CS001");

        // Display available courses
        registrationSystem.displayAvailableCourses();

        // Sample student removing course
        registrationSystem.removeCourse(student1, "MATH001");
    }
}
