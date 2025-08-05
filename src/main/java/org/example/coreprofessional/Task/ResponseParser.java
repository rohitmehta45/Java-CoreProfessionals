package org.example.coreprofessional.Task;

import java.io.*;
import java.text.*;
import java.util.*;

public class ResponseParser {

    public static List<Response> parseResponses(String filePath) {
        List<Response> responses = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int idx1 = line.indexOf('{');
                    int idx2 = line.lastIndexOf('}');
                    if (idx1 == -1 || idx2 == -1) continue;

                    String dateString = line.substring(0, idx1).trim();
                    Date date = sdf.parse(dateString);

                    String jsonPart = line.substring(idx1, idx2 + 1);
                    String requestType = getValue(jsonPart, "requestType");
                    String status = getValue(jsonPart, "status");
                    String data = getValue(jsonPart, "data");

                    responses.add(new Response(date, requestType, status, data));
                } catch (Exception ignored) {
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return responses;
    }

    private static String getValue(String json, String key) {
        int index = json.indexOf("\"" + key + "\"");
        if (index == -1) return "";
        int start = json.indexOf(":", index) + 1;
        int end = json.indexOf(",", start);
        if (end == -1) end = json.indexOf("}", start);
        return json.substring(start, end).replaceAll("^[\"\\s]*|[\"\\s]*$", "");
    }
}
