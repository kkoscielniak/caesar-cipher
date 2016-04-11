/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.kkoscielniak.caesarCipher.model;

/**
 * 
 * @author krystian
 */
public class NumericalValuesException extends Exception {
    
    public NumericalValuesException() {
        System.out.println("Sentence contains non-alphabet characters!");
    }
    
}
