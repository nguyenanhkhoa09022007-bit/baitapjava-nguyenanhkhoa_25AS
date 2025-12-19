import controller.EmployeeController;
import view.EmployeeView;

public class Main {
    public static void main(String[] args) {
        EmployeeView view = new EmployeeView();
        new EmployeeController(view);
        view.setVisible(true);
    }
    
}
