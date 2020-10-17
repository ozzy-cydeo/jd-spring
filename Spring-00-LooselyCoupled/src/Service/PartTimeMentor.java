package Service;

import Implementation.MentorImpl;

public class PartTimeMentor implements MentorImpl {
    @Override
    public void createAccount() {
        System.out.println("Part Time Mentor Account is created...");
    }
}
