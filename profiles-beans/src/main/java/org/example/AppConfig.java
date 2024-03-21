package org.example;

import org.example.formatter.DbReportFormatter;
import org.example.formatter.FileReportFormatter;
import org.example.formatter.ReportFormatter;
import org.example.provider.DbReportProvider;
import org.example.provider.FileReportProvider;
import org.example.provider.ReportProvider;
import org.example.repository.DbReportRepository;
import org.example.repository.FileReportRepository;
import org.example.repository.ReportRepository;
import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public PrettyTime prettyTime() {
        return new PrettyTime();
    }

    @Bean @Profile("file")
    public ReportFormatter fileReportFormatter() {
        return new FileReportFormatter();
    }

    @Bean @Profile("db")
    public ReportFormatter dbReportFormatter() {
        return new DbReportFormatter();
    }

    @Bean @Profile("file")
    public ReportProvider fileReportProvider() {
        return new FileReportProvider();
    }

    @Bean @Profile("db")
    public ReportProvider dbReportProvider() {
        return new DbReportProvider();
    }

    @Bean @Profile("file")
    public ReportRepository fileReportRepository() {
        return new FileReportRepository();
    }

    @Bean @Profile("db")
    public ReportRepository dbReportRepository() {
        return new DbReportRepository();
    }
}
