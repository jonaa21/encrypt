package com.unasat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jonathan on 5/16/2018.
 */
public class PasswordVerifierTest {

    private PasswordVerifier passwordVerifier;


    @Before
    public void setUp() {
        passwordVerifier = new PasswordVerifierImpl();
    }

    @Test
    public void PassForMatchingHash() {
        //Given
        String clearTextPassw = "jonaa";
        String hashedPassw = "$2a$10$Va75FXLu896bIjzdj7NRAutkl7J1Ndhan5rfEALND/KkXxOlBtpYG";

        //When
        boolean isValid = passwordVerifier.isValid(clearTextPassw, hashedPassw);

        //Then
        Assert.assertEquals(true, isValid);
    }

    @Test
    public void FailForNonMatchingHash() {
        //Given
        String clearTextPassw = "jonaa";
        String hashedPassw = "$2a$10$Va75FXLu896bIjzdj7NRAutkl7J1Ndhan5rfEALND/KkXxOlBtpYG";

        //When
        boolean isValid = !passwordVerifier.isValid(clearTextPassw, hashedPassw);

        //Then
        Assert.assertEquals(false, isValid);
    }
}