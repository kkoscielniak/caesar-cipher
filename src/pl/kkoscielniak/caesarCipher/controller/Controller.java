package pl.kkoscielniak.caesarCipher.controller;

import java.util.EmptyStackException;
import pl.kkoscielniak.caesarCipher.model.CaesarCipher;
import pl.kkoscielniak.caesarCipher.model.NumericalValuesException;
import pl.kkoscielniak.caesarCipher.model.OutOfBoundsException;
import pl.kkoscielniak.caesarCipher.view.View;

/**
 * @author krystian
 */
public class Controller {
    /**
     * Method responsible for the work flow and catching existing exceptions.
     * @param args the command line arguments
     * @throws NumericalValuesException
     * @throws OutOfBoundsException
     */
    public static void main(String[] args) throws NumericalValuesException, OutOfBoundsException {
        
        /**
         * The instance of view
         */
        View view = new View();
        
        try {
            String encodedSentence = CaesarCipher.encode(view.getTheSentence(),
                    view.getTheOffset());
            
            view.printMessage(encodedSentence);
            
        } catch (NumericalValuesException e) {
            
        } catch (OutOfBoundsException e) {
            
        }
    }
}

