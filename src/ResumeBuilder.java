import java.util.Scanner;
import java.util.ArrayList;
//public ResumeTemplate(String profileName, String email,
// String jobTitle, String companyName,
// String startMonth, String endMonth,
// int startYear, int endYear,
// ArrayList<String> workExperience, ArrayList<String> jobDescription) {
public class ResumeBuilder {
    public static void main (String[] args){
        ArrayList<ResumeTemplate> workExperience = new ArrayList<>();
        System.out.println("You are creating a professional resume");
        Scanner sc = new Scanner (System.in);
        String userInput = "";
        String profileName = "";
        String email = "";
        String jobTitle = "";
        String companyName = "";
        String startMonth = "";
        String endMonth = "";
        int startYear = 0;
        int endYear = 0;
        String jobDescription = "";



//starting to set up what the user will view

        //starting while loop
        ResumeTemplate Experience1 = new ResumeTemplate();
        System.out.println("please Type your name.");
        profileName = sc.nextLine();
        Experience1.setProfileName(profileName);

        System.out.println("please enter your email address.");
        email = sc.nextLine();
        Experience1.setEmail(email);

        System.out.println("You are welcome to enter as many work experience and type 'STOP' to finish and print result.");

        while ((!userInput.equalsIgnoreCase("STOP"))){
            System.out.println("please enter your a job title.");
            jobTitle = sc.nextLine();
            Experience1.setJobTitle(jobTitle);

            System.out.println("please enter a company name.");
            companyName = sc.nextLine();
            Experience1.setCompanyName(companyName);

            System.out.println("please enter a starting month.");
            startMonth = sc.nextLine();
            Experience1.setStartMonth(startMonth);

            System.out.println("please enter your a starting year.");
            startYear = sc.nextInt();
            Experience1.setStartYear(startYear);
            sc.nextLine();

            System.out.println("please enter your an ending month.");
            endMonth = sc.nextLine();
            Experience1.setEndMonth(endMonth);

            System.out.println("please enter your an ending year.");
            endYear = sc.nextInt();
            Experience1.setEndYear(endYear);
            sc.nextLine();

            System.out.println("please enter a job description.");
            jobDescription = sc.nextLine();
            Experience1.setJobDescription(jobDescription);

            System.out.println("Do you wish to enter another Job Entry? (y/n)");
            userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("n")){System.out.println("RESUME COMPLETE. GOOD LUCK ON THE JOB HUNT");
                break;
            }
            for (ResumeTemplate resume : workExperience){
                System.out.println(resume.displayContent());
                System.out.println("RESUME COMPLETE. GOOD LUCK ON THE JOB HUNT");
            }

        }

    }

}
