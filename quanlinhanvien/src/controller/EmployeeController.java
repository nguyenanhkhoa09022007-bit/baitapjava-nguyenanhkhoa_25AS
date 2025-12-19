package controller;

import model.Employee;
import view.EmployeeView;

public class EmployeeController {
    private EmployeeView view;


    public EmployeeController(EmployeeView view){
        this.view = view;

        view.btnAdd.addActionListener(e -> addEmployee());
    
}

private void addEmployee(){
    try {
        int id = Integer.parseInt(view.txId.getText());
        String name = view.txName.getText();
        double salary = Double.parseDouble(view.txSalary.getText());

        Employee emp = new Employee(id, name, salary);

        // kiểm tra trùng ID trong model
        for (int i = 0; i < view.model.getRowCount(); i++) {
            Object val = view.model.getValueAt(i, 0);
            if (val != null) {
                try {
                    int existingId = Integer.parseInt(val.toString());
                    if (existingId == id) {
                        javax.swing.JOptionPane.showMessageDialog(
                            view,
                            "ID đã tồn tại. Vui lòng nhập ID khác.",
                            "Lỗi",
                            javax.swing.JOptionPane.ERROR_MESSAGE
                        );
                        return; // không thêm
                    }
                } catch (NumberFormatException ignore) {
                    // nếu dữ liệu trong model không phải số thì bỏ qua
                }
            }
        }

        view.model.addRow(new Object[]{
            emp.getId(),
            emp.getName(),
            emp.getSalary()
        });

        view.txId.setText("");
        view.txName.setText("");
        view.txSalary.setText(""); 
    } catch (Exception ex) {
        javax.swing.JOptionPane.showMessageDialog(
            view,
            "dữ liệu không hợp lệ: ",
            "Lỗi",
            javax.swing.JOptionPane.ERROR_MESSAGE
        );
    }
}

}
        




