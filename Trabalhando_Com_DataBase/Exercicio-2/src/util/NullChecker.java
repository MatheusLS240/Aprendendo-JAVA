package util;

public class NullChecker {
    public static boolean isNullOrEmpty(String palavra) {
        if(palavra != null && palavra.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
