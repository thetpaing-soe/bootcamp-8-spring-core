package org.example.formatter;

import org.example.ds.FormattedReport;
import org.example.ds.Report;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dbFormatter")
public class DbReportFormatter implements ReportFormatter {
    @Override
    public FormattedReport format(Report report) {
        System.out.println(getClass().getSimpleName() + "::format(Report report) invoked.");
        return new FormattedReport(report);
    }
}
