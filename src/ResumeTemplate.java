import java.util.ArrayList;

public class ResumeTemplate {
    private String profileName;
    private String email;
    private String jobTitle;
    private String companyName;
    private String startMonth;
    private String endMonth;
    private int startYear;
    private int endYear;
    private String jobDescription;
    public ResumeTemplate(){

    }

    public ResumeTemplate(String profileName, String email,
                          String jobTitle, String companyName, String startMonth,
                          String endMonth, int startYear,
                          int endYear, String jobDescription) {
        this.profileName = profileName;
        this.email = email;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.startYear = startYear;
        this.endYear = endYear;
        this.jobDescription = jobDescription;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    public String displayContent() {
        String resumeContent = "";
        resumeContent = "Name: " + getProfileName() + "\nEmail: " +  "\nJob Title: " +
                getJobTitle() + "\nCompany Nane: " + getCompanyName() + "\nDate: " + getStartMonth() + getStartYear() + "-" + getEndMonth() + getEndYear()+ "\nDuties: " + getJobDescription();
        return resumeContent;
    }




}

