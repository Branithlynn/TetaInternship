package com.Teta.July8;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 * This class is responsible to keep all the employees in the {@link Company} class.
 *
 * <p>
 *     User enters input from the console, then we parse the input and create our {@link Employee} class
 *     afterwards we add the employee to the company.
 *
 * </p>
 *
 * @author Branimir Borisov
 */
public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String userInput = sc.nextLine();
            if (userInput.equals("end")) {
                break;
            }
            String[] inputs = userInput.split(" ");

            company.addEmployee(new Employee(inputs[0], LocalDate.parse(inputs[1]), inputs[2] + inputs[3], Double.parseDouble(inputs[4])));
        }

        System.out.printf("%-10s", "Name");
        System.out.printf("%-30s", "Year of joining");
        System.out.printf("%-20s", "Address");
        System.out.printf("%-25s", "Years in company");
        System.out.printf("%-10s%n","Dollars");
        List<Employee> employees = company.getEmployees();
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("%-15s", employees.get(i).getName());
            System.out.printf("%-20s", employees.get(i).getYearOfJoining());
            System.out.printf("%-30s", employees.get(i).getAddress());
            System.out.printf("%-20s", employees.get(i).getYearsInComp());
            System.out.printf("%-10s%n",employees.get(i).getSalary());
        }
        System.out.print( "Average salary:");
       Company.getSalary(employees);
    }
}

