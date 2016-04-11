/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.kkoscielniak.caesarCipher.model;

import pl.kkoscielniak.caesarCipher.view.View;

/**
 * Thrown if the input is too long or too short
 * @author krystian
 */
public class OutOfBoundsException extends Exception {
    
    /**
     * View instance
     */
    View v = new View();
    
    public OutOfBoundsException() {
        v.printMessage("The string is out of range\n");
    }
    
}