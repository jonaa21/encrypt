package com.unasat;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Created by Jonathan on 5/16/2018.
 */
public class App {

    public static void main(String[] args) {

        String inputPassw = "jonaa";
        String dbPassw = "jonaa";

        String hashStoredPassw = BCrypt.hashpw(dbPassw, BCrypt.gensalt());

        boolean isValid = BCrypt.checkpw(inputPassw, hashStoredPassw);
        System.out.println(isValid);
        System.out.println(hashStoredPassw);
    }
}
