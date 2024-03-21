package org.example.repository;

import org.example.ds.FormattedReport;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component("dbRepository")
//@Profile("db")
public class DbReportRepository implements ReportRepository {
    @Override
    public void save(FormattedReport formattedReport) {
        System.out.println(getClass().getSimpleName() + "::save(FormattedReport formattedReport)");
    }
}
