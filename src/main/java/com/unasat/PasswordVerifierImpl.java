package com.unasat;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Created by Jonathan on 5/16/2018.
 */
public class PasswordVerifierImpl implements PasswordVerifier {

    public boolean isValid(String clearTextPassword, String hashedPassword) {
        return BCrypt.checkpw(clearTextPassword, hashedPassword);
    }
}
