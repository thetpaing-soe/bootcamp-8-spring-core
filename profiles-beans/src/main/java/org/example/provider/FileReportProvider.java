package org.example.provider;

import org.example.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component("fileProvider")
//@Profile("file")
public class FileReportProvider implements ReportProvider {
    @Override
    public Report getReport() {
        System.out.println(this.getClass().getSimpleName() + "::getReport() invoked.");
        return new Report();
    }
}
