public class task1 {
    public static void main(String[] args) {
        String basicURL = "https://example.com/search?";
        String params = "query=java&sort=desc&filter=null";
        String filter = "null";
        buildURL(basicURL, params, filter);
    }

    public static void buildURL(String baseURL, String params, String filter) {
        StringBuilder url = new StringBuilder(baseURL);
        String[] pairs = params.split("&");

        for (int i = 0; i < pairs.length; i++) {
            String[] keyValue = pairs[i].split("=");
            if (!"null".equals(keyValue[1])) {
                if (url.length() > baseURL.length()) {
                    url.append("&");
                }
                url.append(keyValue[0]).append("=").append(keyValue[1]);
            }
        }

        System.out.println(url.toString());
    }
}