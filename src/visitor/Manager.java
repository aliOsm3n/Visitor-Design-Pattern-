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
public class Manager extends Employee{

    public Manager(String name, double income, int vacationday) {
        super(name, income, vacationday);
        System.out.println(name +"   " + income + "    "+ vacationday );
    }
    
    
}
