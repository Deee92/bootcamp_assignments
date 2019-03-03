/**
 * Question 4: Implement the Builder design pattern to create a
 * student object with more than 6 fields
 */

class CollegeStudent {
    private String studentName;
    private int studentID;
    private String studentCourse;
    private String studentMothersName;
    private String studentFathersName;
    private String studentNationality;
    private boolean studentRequiresAccommodation;
    
    public boolean isStudentRequiresAccommodation() {
        return studentRequiresAccommodation;
    }
    
    public void setStudentRequiresAccommodation(boolean studentRequiresAccommodation) {
        this.studentRequiresAccommodation = studentRequiresAccommodation;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
    public String getStudentCourse() {
        return studentCourse;
    }
    
    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }
    
    public String getStudentMothersName() {
        return studentMothersName;
    }
    
    public void setStudentMothersName(String studentMothersName) {
        this.studentMothersName = studentMothersName;
    }
    
    public String getStudentFathersName() {
        return studentFathersName;
    }
    
    public void setStudentFathersName(String studentFathersName) {
        this.studentFathersName = studentFathersName;
    }
    
    public String getStudentNationality() {
        return studentNationality;
    }
    
    public void setStudentNationality(String studentNationality) {
        this.studentNationality = studentNationality;
    }
    
    @Override
    public String toString() {
        return ("___Student details___ " +
                "\nID: " + getStudentID() +
                "\nName: " + getStudentName() +
                "\nCourse: " + getStudentCourse() +
                "\nMother's name: " + getStudentMothersName() +
                "\nFather's name: " + getStudentFathersName() +
                "\nNationality: " + getStudentNationality() +
                "\nRequires accommodation: " + isStudentRequiresAccommodation());
    }
}

// Fluent builder
class CollegeStudentBuilder {
    private CollegeStudent collegeStudent = new CollegeStudent();
    
    CollegeStudentBuilder withStudentName(String name) {
        collegeStudent.setStudentName(name);
        return this;
    }
    
    CollegeStudentBuilder withStudentID(int id) {
        collegeStudent.setStudentID(id);
        return this;
    }
    
    CollegeStudentBuilder withStudentCourse(String course) {
        collegeStudent.setStudentCourse(course);
        return this;
    }
    
    CollegeStudentBuilder withMothersName(String mothersName) {
        collegeStudent.setStudentMothersName(mothersName);
        return this;
    }
    
    CollegeStudentBuilder withFathersName(String fathersName) {
        collegeStudent.setStudentFathersName(fathersName);
        return this;
    }
    
    CollegeStudentBuilder withNationality(String nationality) {
        collegeStudent.setStudentNationality(nationality);
        return this;
    }
    
    CollegeStudentBuilder withAccommodationRequirement(boolean accommodationRequirement) {
        collegeStudent.setStudentRequiresAccommodation(accommodationRequirement);
        return this;
    }
    
    CollegeStudent build() {
        return collegeStudent;
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        CollegeStudentBuilder collegeStudentBuilder = new CollegeStudentBuilder();
        CollegeStudent collegeStudent = collegeStudentBuilder
                .withStudentName("Deepika")
                .withStudentID(1552)
                .withMothersName("Mom")
                .withFathersName("Dad")
                .withNationality("Indian")
                .withStudentCourse("MCA")
                .withAccommodationRequirement(false)
                .build();
        System.out.println(collegeStudent.toString());
    }
}
