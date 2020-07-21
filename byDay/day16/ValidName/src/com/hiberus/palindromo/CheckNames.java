package com.hiberus.palindromo;

public class CheckNames {

    public boolean check(String userName) {
        char[] userNameChars = userName.toCharArray();

        for (int i = 0; i < userNameChars.length; i++) {
            char cc = userNameChars[i];

            if (!((cc >= 65 && cc <= 90) || (cc >= 97 && cc <= 122))) {
                return false;
            }
            //if (cc < 65 || (cc >90 || cc <97) || cc > 122) {
            //    return false;
            //}
        }

        //65 <= x <= 90 OR 97 <= x <= 122
        return true;
    }
}
