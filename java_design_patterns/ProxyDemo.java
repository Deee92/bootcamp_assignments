/**
 * Question 8: Implement the Proxy design pattern to access the
 * record of a student and allow access only to the admin
 */

class Student {
    int studentRollNumber;
    String studentName;
    
    Student(int studentRollNumber, String studentName) {
        this.studentRollNumber = studentRollNumber;
        this.studentName = studentName;
    }
    
    public int getStudentRollNumber() {
        return studentRollNumber;
    }
    
    public void setStudentRollNumber(int studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    void getStudent() {
        System.out.println("Student roll number: " + this.getStudentRollNumber() + ", name: " + this.getStudentName());
    }
}

interface CanAccess {
    void access(Student student);
}

class UniversityEmployee implements CanAccess {
    String employeeDesignation;
    
    UniversityEmployee() {
        this.employeeDesignation = "non-admin";
    }
    
    @Override
    public void access(Student student) {
        System.out.println("As a " + employeeDesignation + " employee of the University, I do not have access to students' details");
    }
}

class AdminProxy extends UniversityEmployee {
    
    public AdminProxy() {
        employeeDesignation = "admin";
    }
    
    @Override
    public void access(Student student) {
        System.out.println("As an " + employeeDesignation + " employee of the University, I have access to students' details");
        student.getStudent();
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        Student student = new Student(1552, "Deepika");
        CanAccess nonAdmin = new UniversityEmployee();
        nonAdmin.access(student);
        CanAccess admin = new AdminProxy();
        admin.access(student);
    }
}
