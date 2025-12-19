package view;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class EmployeeView extends JFrame {
    public JTextField txId, txName, txSalary;
    public JButton btnAdd;
    public JTable table;
    public DefaultTableModel model;
    
    public EmployeeView(){
        setTitle("Employee Management");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4,2 ,5,5));
        panel.add(new JLabel("ID:"));
        txId = new JTextField();
        panel.add(txId);


        panel.add(new JLabel("Name:"));
        txName = new JTextField();
        panel.add(txName);


        panel.add(new JLabel("Salary:"));
        txSalary = new JTextField();
        panel.add(txSalary);


        btnAdd = new JButton("Add Employee");
        panel.add(btnAdd);
        add(panel, BorderLayout.NORTH);


        model = new DefaultTableModel(new String[]{"ID", "Name", "Salary"}, 0);
        table = new JTable(model);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);

    }      
}
