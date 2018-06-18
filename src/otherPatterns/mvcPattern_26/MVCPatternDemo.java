package otherPatterns.mvcPattern_26;

/**
 * (NO. 26)
 * MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to separate
 * application's concerns.
 * Model - Model represents an object or JAVA POJO carrying data. It can also have logic
 * to update controller if its data changes.
 * View - View represents the visualization of the data that model contains.
 * Controller - Controller acts on both model and view. It controls the data flow into
 * model object and updates the view whenever data changes. It keeps view and model separate.
 */
public class MVCPatternDemo {
    public static void main(String[] args) {

        // Fetch student record based on his roll no from the database
        Student model = retriveStudentFromDatabase();

        // Create a view to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // Update model data
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
