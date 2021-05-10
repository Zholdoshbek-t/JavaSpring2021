import com.google.gson.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        Main main = new Main();
        StringBuilder jsons = main.sendGet();
        ArrayList<Text> textsFromJson = new ArrayList<>();
        int index = 0;
        while(jsons.indexOf("{", index) != -1) {
            String strJson = jsons.substring(jsons.indexOf("{", index), jsons.indexOf("}", index) + 1);
            index = jsons.indexOf("}", index)+1;
            Text t = gson.fromJson(strJson, Text.class);
            textsFromJson.add(t);
        }
        System.out.println(textsFromJson);
    }

    private StringBuilder sendGet() throws Exception {

        ArrayList<String> jsons = new ArrayList<>();
        boolean add = false;
        String url = "https://jsonplaceholder.typicode.com/posts";

        HttpURLConnection httpClient =
                (HttpURLConnection) new URL(url).openConnection();

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
                response.append('\n');
            }
        }
        return response;
    }
}

