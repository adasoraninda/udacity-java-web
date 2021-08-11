public class Main {

    public static void main(String[] args) {
        System.out.println(vowelOnly("bebek"));
        System.out.println(vowelOnly("x00"));
    }

    private static String vowelOnly(String input) {
        var vowels = "aiueo";
        var sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (vowels.contains(String.valueOf(c).toLowerCase())) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

}
