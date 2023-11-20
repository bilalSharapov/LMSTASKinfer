import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("bili", "sharapo", "m", LocalDate.of(2022,12,12), new EducationCenter("Colleg","kurguztan",2022,2000));
        Student student1 = new Student("bek", "ds", "m", LocalDate.of(2020,11,1), new EducationCenter("Univer","kurguztan",2011,2013));
        Student student2 = new Student("nyr", "fd", "j", LocalDate.of(2019,4,14), new EducationCenter("School","Kurguztan",2013,2011));
        Student student3 = new Student("aibek", "df", "m", LocalDate.of(2013,8,18), new EducationCenter("univer","Tyrkya",1993,1999));
        Student student4 = new Student("aida", "hb", "j",LocalDate.of(2000,9,29), new EducationCenter("Colleg", "CSHA",2023,2014));
        Student student5 = new Student("azza", "fv", "m", LocalDate.of(2015, 4,21), new EducationCenter("School","Kazakstan",2021,2022));
        Student student6 = new Student("ajibek", "ws", "m", LocalDate.of(2023,2,27), new EducationCenter("School","Kurguztan",2020,1999));
        Student student7 = new Student("cuimuk", "easd", "m", LocalDate.of(2003,5,15), new EducationCenter("Univer" , "Kurguztan" ,2020,2018));

        Student[] students = new Student[]{ student, student1, student2, student3, student4, student5, student6, student7};

            System.out.println(Arrays.toString(students));

     StudentArray(students);

    }
    public static void StudentArray(Student[] students){
        for (int i = 0; i < students.length; i++) {
            students[i].getStudentsEducationCenter();
        }
        for (int i = 0; i < students.length; i++) {
            students[i].getStudentsStudyingYear();
        }

    }
}