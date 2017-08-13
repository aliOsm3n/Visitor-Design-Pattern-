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
public interface IVisitor {
    
    void visit(Element element);
    
}

abstract class Element{
    public abstract void Accept(IVisitor visitor);

}
