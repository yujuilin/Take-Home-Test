public class DetectInt {

    public static boolean checkInt(String input) {
        int inputLen = input.length();
        for (int i = 0; i < inputLen; i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                return true;
            }
        }
        return false;
    }
}
