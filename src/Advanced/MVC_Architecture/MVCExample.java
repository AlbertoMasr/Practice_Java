package Advanced.MVC_Architecture;

// Model
class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// View
class StudentView {
    void printStudentDetails(String studentName, int studentId) {
        System.out.println("Student: ");
        System.out.println("Name: "+ studentName);
        System.out.println("ID: "+ studentId);
    }
}

// Controller
class StudentController {
    private Student model;
    private StudentView view;

    StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    void updateView() {
        view.printStudentDetails(model.getName(), model.getId());
    }
}

public class MVCExample {
    public static void main(String[] args) {
        Student student = new Student(1, "Coco");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();
    }
}
