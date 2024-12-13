class CSVGenerator {
    public static String buildCSV(String[] head, String[][] data_elem) {
        StringBuilder csv = new StringBuilder();

        csv.append(String.join(",", head)).append("\n");

        for (String[] row : data_elem) {
            csv.append(String.join(",", row)).append("\n");
        }
        return csv.toString().trim();
    }
}

public class task1 {
    public static void main(String[] args) {
        String[] headers = new String[]{"Name", "Age", "City"};
        String[][] data = new String[][]{
            {"John", "35", "New York"},
            {"Alice", "25", "Los Angeles"},
            {"Bob", "35", "Chicago"}
        };

        CSVGenerator csvGenerator = new CSVGenerator();
        System.out.println(csvGenerator.buildCSV(headers, data));
    }
}
