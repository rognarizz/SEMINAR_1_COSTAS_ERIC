public class task3 {
    public static void main(String[] args) {
        String text = "line1\n\nline2\n\nline3";
        String output = deleteEmpty(text);
        System.out.println(output);
    }

    public static String deleteEmpty(String arg) {
        String[] splitted_arg = arg.split("\n");
        StringBuilder sb = new StringBuilder();

        for (String line : splitted_arg) {
            if (!line.trim().isEmpty()) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
            sb.append(line);
            }
        }
    return sb.toString();
    }
}