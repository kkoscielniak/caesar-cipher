package pl.kkoscielniak.caesarCipher.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author krystian
 */
public class CaesarCipherTest {
    
    public CaesarCipherTest() {
        
    }
    
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    
    /**
     * Tests whether the input contains numbers/special characters
     * @throws NumericalValuesException
     * @throws OutOfBoundsException 
     */
    @Test
    public void shouldBeLettersOrSpacesOnly() throws NumericalValuesException, 
        OutOfBoundsException {
        
        String input = "lorem ipsum 123";
        exception.expect(NumericalValuesException.class);
        CaesarCipher.encode(input, 3);
    }

    /**
     * Tests whether the string is too long
     * @throws OutOfBoundsException 
     * @throws NumericalValuesException 
     */
    @Test
    public void shouldntBeLongerThan15Characters() throws OutOfBoundsException, 
            NumericalValuesException {
        
        String input = "lorem ipsum dolor sit amet.";
        
        exception.expect(OutOfBoundsException.class);
        CaesarCipher.encode(input, 3);        
    }
    
    /**
     * Tests whether the string is too short 
     * @throws OutOfBoundsException 
     * @throws NumericalValuesException 
     */    
    @Test
    public void shouldntBeShorterThan5Characters() throws OutOfBoundsException, 
            NumericalValuesException {
        
        String input = "lor";
        
        exception.expect(OutOfBoundsException.class);
        CaesarCipher.encode(input, 3);        
    }
   
    @Test 
    public void shouldEncodeCorrectly() throws OutOfBoundsException, 
            NumericalValuesException {
        
        String input = "ala ma kota";
        String expectedResult = "epe qe osxe";
        String result = CaesarCipher.encode(input, 4);
        
        assertEquals(expectedResult, result);       
    }
}
