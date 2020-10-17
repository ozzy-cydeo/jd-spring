package Service;

import Implementation.MentorImpl;

public class FullTimeMentor implements MentorImpl {
    @Override
    public void createAccount() {
        System.out.println("Full Time Mentor Account is created...");
    }
}
