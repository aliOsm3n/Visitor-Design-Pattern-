/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visitor;

/**
 *
 * @author Ali Othman
 */
public class Visitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employees  employee =new  Employees();
        employee.Attach(new Manager("Ali", 24.0 ,03));
        employee.Attach(new Manager("Aliaa", 244.0 ,02));
        employee.Attach(new Manager("Alaa", 224.0 ,01));
        employee.Attach(new Manager("Ahmed", 245.0 ,00));
        employee.Attach(new Clerk("Ahmed", 999.99, 3));
        
        
    }
    
}
