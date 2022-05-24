public class AlternateCase extends Convertor {

    String applyOperation(String inputString) {

        int i = 0;
        StringBuilder inputStringBuilder = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (c > 64 && c < 91 || c > 96 && c < 123) {
                inputStringBuilder.append((char) (i++ % 2 < 1 ? (c | 32) : (c & ~32)));
            } else inputStringBuilder.append(c);
        }
        return inputStringBuilder.toString();
    }
}
