package com.careerit.jfs.day7;

enum ReportType {
    HTML, PDF, EXCEL, CSV
}
public class AssignmentQuestions2 {

    public static void main(String[] args) {

            generateReport(ReportType.HTML);
            generateReport(ReportType.PDF);
            generateReport(ReportType.EXCEL);
            generateReport(ReportType.CSV);

    }

    public static void generateReport(ReportType type){
        // Logic to generate report
        // If type is HTML then message should be "Generating HTML report"
        // If type is PDF then message should be "Generating PDF report"
        // If type is EXCEL then message should be "Generating EXCEL report"
        // If type is CSV then message should be "Generating CSV report"
        // If type is not any of the above then message should be "Invalid report type"
    }



}
