package solutions;

import static utils.FileUtils.P059;
import static utils.FileUtils.getAllLinesAsStringArray;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Problem059 {

    public int solve() throws UnsupportedEncodingException {
        String[] encrypted = getAllLinesAsStringArray(P059);
        System.out.println(Arrays.toString(encrypted));
        int maxAsciiSum = 0;
        String maxDecrypted = "";
        for (int i = 97; i <= 122; i++) { // lower-case letters a-z
            for (int j = 97; j <= 122; j++) {
                for (int k = 97; k <= 122; k++) {
                    // generate the password
                    byte[] password = { (byte) i, (byte) j, (byte) k };

                    // decrypt the text using the password
                    byte[] decrypted = new byte[encrypted.length];
                    for (int m = 0; m < encrypted.length; m++) {
                        decrypted[m] = (byte) (Byte.parseByte(encrypted[m]) ^ password[m % 3]);
                    }

                    // check if the decrypted text contains common English words
                    String text = new String(decrypted, "UTF-8");
                    if (text.contains(" the ") && text.contains(" and ") && text.contains(" of ")) {
                        // compute the sum of the ASCII values in the text
                        int asciiSum = 0;
                        for (byte b : decrypted) {
                            asciiSum += b;
                        }
                        if (asciiSum > maxAsciiSum) {
                            maxAsciiSum = asciiSum;
                            maxDecrypted = text;
                        }
                    }
                }
            }
        }
        return 0;
    }
}
