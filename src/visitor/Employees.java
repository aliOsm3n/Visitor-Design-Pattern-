/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali Othman
 */
public class Employees {
    List<Employee> employees = new ArrayList<Employee>();
    
    public void Attach(Employee e){
    employees.add(e);
    }
    
    public void Detach(Employee e){
    employees.remove(e);
    }
    
    public void Accept(IVisitor visitor){
        for (Employee employee : employees) {
            employee.Accept(visitor);
        }
    }
}
