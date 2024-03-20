package org.example.service;

import org.example.ds.FormattedReport;
import org.example.ds.Report;
import org.example.formatter.ReportFormatter;
import org.example.provider.ReportProvider;
import org.example.repository.ReportRepository;
import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ReportService {

    private final ReportFormatter reportFormatter;

    private final ReportRepository reportRepository;

    private final ReportProvider reportProvider;

    @Autowired
    private PrettyTime prettyTime;

    public ReportService(@Qualifier("fileFormatter") ReportFormatter reportFormatter,
                         @Qualifier("fileRepository") ReportRepository reportRepository,
                         @Qualifier("fileProvider") ReportProvider reportProvider) {
        this.reportFormatter = reportFormatter;
        this.reportRepository = reportRepository;
        this.reportProvider = reportProvider;
    }

    public void doAction() {
        Report report = reportProvider.getReport();
        FormattedReport formattedReport = reportFormatter.format(report);
        reportRepository.save(formattedReport);
    }
}
