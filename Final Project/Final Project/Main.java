import admin.*;
import customer.*;
import Interface.*;
import info.Customer;
import info.Employee;
import start.StartApplication;

import java.util.ArrayList;


public class Main{

    static ArrayList<Employee> initialEmployee(){
        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(1,"Belal","800");
        employees.add(emp1);

        Employee emp2 = new Employee(2,"Payel","900");
        employees.add(emp2);

        Employee emp3 = new Employee(3,"Runa","1200");
        employees.add(emp3);

        Employee emp4 = new Employee(1,"Juyel","1800");
        employees.add(emp4);

        Employee emp5 = new Employee(5,"Helal","2200");
        employees.add(emp5);

        Employee emp6 = new Employee(6,"Faysal","3600");
        employees.add(emp6);

        Employee emp7 = new Employee(7,"Munna","5000");
        employees.add(emp7);

        Employee emp8 = new Employee(1,"Mediul","7000");
        employees.add(emp8);

        Employee emp9 = new Employee(9,"Hira","9000");
        employees.add(emp9);

        Employee emp10 = new Employee(10,"Hero","10000");
        employees.add(emp10);
        return employees;
    }

    static ArrayList<Customer> initialCustomers(){
        ArrayList<Customer> customers = new ArrayList<>();

        Customer cust1 = new Customer(1,"Mostak","Dinajpur", "01784568154");
        customers.add(cust1);

        Customer cust2 = new Customer(2,"Siam","Parbatipur", "01785585645");
        customers.add(cust2);

        Customer cust3 = new Customer(3, "Rabbi","Soidpur", "01463945446");
        customers.add(cust3);

        Customer cust4 = new Customer(4,"Sumon","Rangpur","01456325897");
        customers.add(cust4);

        Customer cust5 = new Customer(5, "Nehal", "Dhaka", "01947239853");
        customers.add(cust5);

        Customer cust6 = new Customer(6, "Priya", "Pabna", "01725785234");
        customers.add(cust6);

        Customer cust7 = new Customer(7, "Jit", "Foridpur", "01985622434");
        customers.add(cust7);

        Customer cust8 = new Customer(8,"Sujon", "Fulbari","01566956359");
        customers.add(cust8);

        Customer cust9 = new Customer(9, "Rafeu", "Nilphamari", "017586575314");
        customers.add(cust9);

        Customer cust10 = new Customer(10,"Santo","Hili", "017973634534");
        customers.add(cust10);



        return customers;
    }

    public static void main(String[] args) {
        StartApplication app = new StartApplication(initialCustomers(), initialEmployee());
        app.startApplication();
    }

}

