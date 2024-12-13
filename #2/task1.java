public class task1 {
    public static void main(String[] args) {
        String basicURL = "https://example.com/search?";
        String params = "query=java&sort=desc&filter=null";
        buildURL(basicURL, params);
    }

    public static void buildURL(String baseURL, String params) {
        StringBuilder url = new StringBuilder(baseURL);
        String[] pairs = params.split("&");
    
        for (int i = 0; i < pairs.length; i++) {
            String[] keyValue = pairs[i].split("=");
    
            // Проверка, что значение не пустое и не равно строке "null"
            if (keyValue.length > 1 && keyValue[1] != null && !keyValue[1].isEmpty()) {
                // Добавление амперсанда, если это не первый параметр
                if (url.length() > baseURL.length()) {
                    url.append("&");
                }
                // Добавление параметра ключ-значение в URL
                url.append(keyValue[0]).append("=").append(keyValue[1]);
            }
        }
    
        System.out.println(url.toString());
    }
    
}
