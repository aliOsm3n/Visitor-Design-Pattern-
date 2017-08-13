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
public class Employee extends Element{
    
    private String name;
    private double income;
    private int vacationday;

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public int getVacationday() {
        return vacationday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setVacationday(int vacationday) {
        this.vacationday = vacationday;
    }

    public Employee(String name, double income, int vacationday) {
        this.name = name;
        this.income = income;
        this.vacationday = vacationday;
    }

    @Override
    public void Accept(IVisitor visitor) {
        visitor.visit(this);
    }

    
}
