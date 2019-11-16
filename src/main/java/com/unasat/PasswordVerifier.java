package com.unasat;

/**
 * Created by Jonathan on 5/16/2018.
 */
public interface PasswordVerifier {

    public boolean isValid(String clearTextPassword, String hashedPassword);
}
