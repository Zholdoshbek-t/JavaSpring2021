import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Main main = new Main();
        StringBuilder SBtext = main.sendGet();
        String text = SBtext.toString();
        ArrayList<CatInfo> catInfos = new ArrayList<>();
        while (text.contains("{")) {
            String str = text.substring(text.indexOf("{"), text.indexOf("}", text.indexOf("}") + 1) + 1);
            CatInfo info = gson.fromJson(str, CatInfo.class);
            text = text.substring(text.indexOf("}", text.indexOf("}") + 1) + 1);
            catInfos.add(info);
        }
        System.out.println(catInfos);
    }

    private StringBuilder sendGet() throws IOException {
        String url = "https://cat-fact.herokuapp.com/facts";

        HttpURLConnection httpClient = (HttpURLConnection) new URL(url).openConnection();

        httpClient.setRequestMethod("GET");
        httpClient.setRequestProperty("User-Agent", "Mozilla/5.0");

        int responseCode = httpClient.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        StringBuilder response;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(httpClient.getInputStream()))) {

            response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }
        }
        return response;
    }
}
