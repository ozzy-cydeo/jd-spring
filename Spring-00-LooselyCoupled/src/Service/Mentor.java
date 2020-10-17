package Service;

import Implementation.MentorImpl;

public class Mentor {

    MentorImpl mentor;

    public Mentor(MentorImpl mentor) {

        this.mentor = mentor;
    }


    public void manageAccount() {

        this.mentor.createAccount();
    }
}
