/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.kkoscielniak.caesarCipher.model;

import pl.kkoscielniak.caesarCipher.view.View;

/**
 *
 * @author krystian
 */
public class OutOfBoundsException extends Exception {
    
    public OutOfBoundsException() {
        System.out.println("The string is out of range");
    }
    
}