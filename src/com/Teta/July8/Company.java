package com.Teta.July8;

import java.util.ArrayList;
import java.util.List;

/**
 * Saves the data of all the employees that it receives from  {@link Employee} .
 * @author Branimir Borisov
 */
public class Company {
    private List<Employee> employees = new ArrayList<>();
    private static double averagesalary;
    public void addEmployee(Employee employee){
        if (employee != null){
            employees.add(employee);
        }
        else{
            System.out.println("You cant add a non existing employee");
        }
    }

    /**
     *
     *  searches if a employee with the name exists.
     * @return
     */
   // public Employee getEmployeeByName(String name){
     //   for(int i = 0; i <employees.size();i++){
     //       if(name.equals(employees.get(i).getName())){
       //     }
      //  }
    //}

    public List<Employee> getEmployees() {
        return employees;
    }


    /**
     * This method calculates the average salary from all of the employees and prints it.
     * @param employees
     */
    public static void getSalary(List<Employee> employees){
        double totalSalary=0;
        int count=0;
        for(int i =0;i<employees.size();i++){
            totalSalary=totalSalary+employees.get(i).getSalary();
            count++;
        }
        averagesalary=totalSalary/count;

        System.out.println(Math.round(averagesalary*100.0)/100.0);
    }


}
