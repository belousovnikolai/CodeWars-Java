package com.codewars.kata.kyu6;

import org.testng.annotations.Test;

import static com.codewars.kata.kyu6.SimpleEncryptionAlternatingSplit.decrypt;
import static com.codewars.kata.kyu6.SimpleEncryptionAlternatingSplit.encrypt;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class SimpleEncryptionAlternatingSplitTest {

    @Test
    public void testEncrypt() {
        assertEquals("This is a test!", encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", encrypt("This is a test!", 3));
        assertEquals("This is a test!", encrypt("This is a test!", 4));
        assertEquals("This is a test!", encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", encrypt("This kata is very interesting!", 1));
    }

    @Test
    public void testDecrypt() {
        assertEquals("This is a test!", decrypt("This is a test!", 0));
        assertEquals("This is a test!", decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", decrypt("This is a test!", 4));
        assertEquals("This is a test!", decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

    @Test
    public void testNullOrEmpty() {
        assertEquals("", encrypt("", 0));
        assertEquals("", decrypt("", 0));
        assertNull(encrypt(null, 0));
        assertNull(decrypt(null, 0));
    }

}
