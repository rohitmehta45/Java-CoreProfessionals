package org.example.coreprofessional.Task;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/org.example.coreprofessional.exercise2nd/22185435-90a1-4790-8444-0a3e92c590c1.txt";
        List<Response> responses = ResponseParser.parseResponses(filePath);

        int successInJuly = ResponseAnalyzer.countByStatusAndMonth(responses, "Success", 7, 2024);
        int failedInJuly = ResponseAnalyzer.countByStatusAndMonth(responses, "Failed", 7, 2024);
        int pdfSignCount = ResponseAnalyzer.countByRequestType(responses, "PdfSign");
        int uniqueMonths = ResponseAnalyzer.countDistinctMonths(responses);

        System.out.println("Success in July 2024: " + successInJuly);
        System.out.println("Failed in July 2024: " + failedInJuly);
        System.out.println("Number of PdfSign requests: " + pdfSignCount);
        System.out.println("Unique months in dataset: " + uniqueMonths);

        String outputCSV = "output/request_type_summary.csv";
        ResponseAnalyzer.exportRequestTypeCountPerMonthToCSV(responses, outputCSV);
    }
}
