package com.example.labweek8;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    @FXML
    private TableView<Employee> tableView;

    @FXML
    private TableColumn<Employee, Integer> idColumn;
    @FXML
    private TableColumn<Employee, String> nameColumn;

    @FXML
    private Label employeeCountLabel;
    @FXML
    private Label averageSalaryLabel;

    @FXML
    private TextField employeeNameTextField;

    private ObservableList<Employee> employees;

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        employees = DatabaseConnection.getAllEmployees();

        tableView.setItems(employees);

        updateLabels();
    }

    private void updateLabels() {
        int employeeCount = employees.size();
        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        double averageSalary = employeeCount > 0 ? totalSalary / employeeCount : 0;

        employeeCountLabel.setText("Number of Employees: " + employeeCount);
        averageSalaryLabel.setText("Average Salary: $" + String.format("%.2f", averageSalary));
    }

    @FXML
    private void deleteEmployee() {
        String nameToDelete = employeeNameTextField.getText();
        if (!nameToDelete.isEmpty()) {
            employees.removeIf(employee -> employee.getName().equals(nameToDelete));
            updateLabels();
            employeeNameTextField.clear();
        }
    }
}