package com.avensys.CVparserApplication.openai;

import java.util.List;

public class CompaniesDetails {
    private String name;
    private String startDate;
    private String endDate;
    private double noOfYears;
    private String jobTitle;
    private List<String> responsibilities;

    public CompaniesDetails() {
    }

    public CompaniesDetails(String name, String startDate, String endDate, double noOfYears, String jobTitle, List<String> responsibilities) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.noOfYears = noOfYears;
        this.jobTitle = jobTitle;
        this.responsibilities = responsibilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getNoOfYears() {
        return noOfYears;
    }

    public void setNoOfYears(double noOfYears) {
        this.noOfYears = noOfYears;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<String> getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(List<String> responsibilities) {
        this.responsibilities = responsibilities;
    }
}
