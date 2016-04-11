package pl.kkoscielniak.caesarCipher.model;

import pl.kkoscielniak.caesarCipher.view.View;

/**
 * Thrown if the input contains non-alphabet characters
 * @author krystian
 */
public class NumericalValuesException extends Exception {
    
    /**
     * View instance
     */
    View v = new View();
    
    public NumericalValuesException() {
        v.printMessage("Sentence contains non-alphabet characters!\n");
    }
}
