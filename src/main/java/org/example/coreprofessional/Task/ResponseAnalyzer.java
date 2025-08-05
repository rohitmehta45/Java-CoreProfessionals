package org.example.coreprofessional.Task;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

public class ResponseAnalyzer {

    public static int countByStatusAndMonth(List<Response> list, String targetStatus, int month, int year) {
        int count = 0;
        Calendar cal = Calendar.getInstance();
        for (Response r : list) {
            cal.setTime(r.getDate());
            int m = cal.get(Calendar.MONTH) + 1;
            int y = cal.get(Calendar.YEAR);
            if (r.getStatus().equalsIgnoreCase(targetStatus) && m == month && y == year) {
                count++;
            }
        }
        return count;
    }

    public static int countByRequestType(List<Response> list, String targetType) {
        int count = 0;
        for (Response r : list) {
            if (r.getRequestType().equalsIgnoreCase(targetType)) {
                count++;
            }
        }
        return count;
    }

    public static int countDistinctMonths(List<Response> list) {
        Set<String> months = new HashSet<>();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        for (Response r : list) {
            months.add(sdf.format(r.getDate()));
        }
        return months.size();
    }

    public static void exportRequestTypeCountPerMonthToCSV(List<Response> list, String outputPath) {
        Map<String, Map<String, Integer>> monthToTypeCount = new TreeMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");

        for (Response r : list) {
            String month = sdf.format(r.getDate());
            String requestType = r.getRequestType();

            monthToTypeCount.putIfAbsent(month, new HashMap<>());
            Map<String, Integer> typeCount = monthToTypeCount.get(month);
            typeCount.put(requestType, typeCount.getOrDefault(requestType, 0) + 1);
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            writer.println("Month,RequestType,Count");
            for (String month : monthToTypeCount.keySet()) {
                Map<String, Integer> typeCounts = monthToTypeCount.get(month);
                for (Map.Entry<String, Integer> entry : typeCounts.entrySet()) {
                    writer.printf("%s,%s,%d%n", month, entry.getKey(), entry.getValue());
                }
            }
            System.out.println("CSV export completed: " + outputPath);
        } catch (IOException e) {
            System.err.println("Error writing CSV: " + e.getMessage());
        }
    }
}
