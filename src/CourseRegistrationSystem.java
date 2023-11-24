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

public class CourseRegistrationSystem {
    List<Course> courses;
    List<Student> students;

    public CourseRegistrationSystem() {
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
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println("Code: " + course.code);
            System.out.println("Title: " + course.title);
            System.out.println("Description: " + course.description);
            System.out.println("Capacity: " + course.capacity + " slots available out of " + course.capacity);
            System.out.println("Schedule: " + course.schedule);
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        CourseRegistrationSystem registrationSystem = new CourseRegistrationSystem();
        // Adding sample courses
        Course course1 = new Course("CS001", "Introduction to Computer Science", "Basic concepts of programming", 30, "Mon/Wed/Fri 9-11 AM");
        Course course2 = new Course("MATH001", "Calculus", "Fundamental principles of calculus", 25, "Tue/Thu 1-3 PM");
        registrationSystem.addCourse(course1);
        registrationSystem.addCourse(course2);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Register for a course");
            System.out.println("2. Drop a course");
            System.out.println("3. Display available courses");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID:");
                    String studentID = scanner.nextLine();
                    System.out.println("Enter course code to register:");
                    String registerCode = scanner.nextLine();
                    Student registerStudent = new Student(studentID, "");
                    registrationSystem.registerStudent(registerStudent, registerCode);
                    break;
                case 2:
                    System.out.println("Enter student ID:");
                    String dropStudentID = scanner.nextLine();
                    System.out.println("Enter course code to drop:");
                    String dropCode = scanner.nextLine();
                    Student dropStudent = new Student(dropStudentID, "");
                    registrationSystem.removeCourse(dropStudent, dropCode);
                    break;
                case 3:
                    registrationSystem.displayAvailableCourses();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        scanner.close();
    }
}
