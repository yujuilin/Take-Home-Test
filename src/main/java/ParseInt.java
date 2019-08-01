public class ParseInt {
    private boolean isInt;
    private int value;

    public ParseInt(String input) {
        this.isInt = true;
        int start = 0;
        if (input.charAt(0) == '-') {
            start = 1;
        }
        long buffer = 0;
        int inputLen = input.length();
        for (int i = start; i < inputLen; i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9' || buffer > 2147483647) {
                this.value = -1;
                this.isInt = false;
                break;
            }
            else {
                buffer *= 10;
                buffer += input.charAt(i) - '0';
            }
        }
        if (this.isInt) {
            this.value = (int)buffer;
            if (start == 1) {
                this.value *= -1;
            }
        }
    }

    public boolean getIsInt() {
        return this.isInt;
    }

    public int getValue() {
        return this.value;
    }
}
