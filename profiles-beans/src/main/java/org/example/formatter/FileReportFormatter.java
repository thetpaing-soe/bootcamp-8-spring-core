package org.example.formatter;

import org.example.ds.FormattedReport;
import org.example.ds.Report;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component("fileFormatter")
//@Profile("file")
public class FileReportFormatter implements ReportFormatter {
    @Override
    public FormattedReport format(Report report) {
        System.out.println(this.getClass().getSimpleName() + "::format(Report report) invoked.");
        return new FormattedReport(report);
    }
}
