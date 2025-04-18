package com.forceequals.api.model;

public class Account {
    private Long id;
    private String companyName;
    private int matchScore;
    private String status;

    public Account() {}

    public Account(Long id, String companyName, int matchScore, String status) {
        this.id = id;
        this.companyName = companyName;
        this.matchScore = matchScore;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public int getMatchScore() { return matchScore; }
    public void setMatchScore(int matchScore) { this.matchScore = matchScore; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}