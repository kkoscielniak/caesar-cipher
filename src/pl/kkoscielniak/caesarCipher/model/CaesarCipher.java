package pl.kkoscielniak.caesarCipher.model;

/**
 *
 * @author krystian
 */
public class CaesarCipher {

    /**
     * Encodes the given string with Caesar Cipher
     * @param enc string to be encoded
     * @param offset offset of the cipher
     * @return encoded string
     * @throws NumericalValuesException
     * @throws OutOfBoundsException
     */
    public static String encode(String enc, int offset) 
            throws NumericalValuesException, OutOfBoundsException {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        
        if(enc.length() < 5 || enc.length() > 15) {
            throw new OutOfBoundsException();
        }
            
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i) || i == ' ') {
                if (i != ' ') {
                    if (Character.isUpperCase(i)) {
                        encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                    } else {
                        encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                    }
                } else {
                    encoded.append(' ');
                }
            } else {
                throw new NumericalValuesException();
            }
        }
        return encoded.toString();
    }
    
    /**
     * Decodes the encoded string
     * @param enc String to be decoded
     * @param offset Offset of the initial encryption
     * @return decoded string 
     * @throws NumericalValuesException 
     */
    public static String decode(String enc, int offset) 
            throws NumericalValuesException, OutOfBoundsException {
        return encode(enc, 26-offset);
    }
}
