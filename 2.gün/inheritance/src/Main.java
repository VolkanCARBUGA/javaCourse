public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employe employe = new Employe();
        customer.firstName = "Belo";
        employe.lastName="ahmet";
        employe.salary = 3400.90;
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.bestEmployee(employe);
        CustomerManager customerManager = new CustomerManager();
        customerManager.list();
    }
}