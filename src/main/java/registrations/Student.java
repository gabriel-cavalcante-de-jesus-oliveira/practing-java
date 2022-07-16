package registrations;

public class Student {
    private String name;
    private String lastName;
    private String registrationNumber;
    private int StudentClass;
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(int StudentClass) {
        this.StudentClass = StudentClass;
    }
}