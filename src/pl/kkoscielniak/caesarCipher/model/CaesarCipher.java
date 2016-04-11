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
     */
    public static String encode(String enc, int offset) 
            throws NumericalValuesException {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
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
            throws NumericalValuesException {
        return encode(enc, 26-offset);
    }
}
