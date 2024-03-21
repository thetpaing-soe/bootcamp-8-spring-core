package org.example.provider;

import org.example.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component("dbProvider")
//@Profile("db")
public class DbReportProvider implements ReportProvider {
    @Override
    public Report getReport() {
        System.out.println(this.getClass().getSimpleName() + "::getReport().");
        return new Report();
    }
}
