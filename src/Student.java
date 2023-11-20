import java.sql.DriverPropertyInfo;
import java.time.LocalDate;

public class Student implements  Study {
    private  String name ;
    private  String surname;
    private  String Gender ;
    private  LocalDate dateOfStart;
    private EducationCenter EducationCenter;

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.Gender = gender;
        this.dateOfStart = dateOfStart;
        EducationCenter = educationCenter;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Gender='" + Gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", EducationCenter='" + EducationCenter + '\'' +
                '}';
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println(EducationCenter);
    }

    @Override
    public void getStudentsStudyingYear() {
        LocalDate currentYear = LocalDate.now();
        int year = currentYear.getYear() - dateOfStart.getYear();
        System.out.println(year);
        System.out.println(name + "-" + dateOfStart + "канча жыл окуганы");

    }

}
