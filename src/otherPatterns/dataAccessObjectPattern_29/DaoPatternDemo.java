package otherPatterns.dataAccessObjectPattern_29;

/**
 * (No 29)
 * Data Access Object Pattern or DAO pattern is used to separate low level data accessing API or operations
 * from high level business services. Following are the participants in Data Access Object Pattern.
 * - Data Access Object Interface: This interface defines the standard operations to be performed on a model object(s)
 * - Data Access Object Concrete class: This class implements above interface. This class is responsible to get data
 * from a data source which can be database / xml or any other storage mechanism.
 * - Model Object or Value Object: This object is simple POJO containing get/set methods to store data retrieved using
 * DAO class.
 */
public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        // print all students
        studentDao.getAllStudent()
                .forEach(student ->
                        System.out.println("Student: [Roll No: " + student.getRollNo() +
                                ", Name: " + student.getName()));

        // update student
        Student student = studentDao.getAllStudent().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        // get the student
        studentDao.getStudent(0);
        System.out.println("Student: [Roll No: " + student.getRollNo() + ", Name: " + student.getName());
    }
}
