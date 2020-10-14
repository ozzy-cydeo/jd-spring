package Service;

import Implementation.Mentor;

public class MentorImplementor {

    Mentor mentor;

    public MentorImplementor(Mentor mentor) {
        this.mentor = mentor;
    }


    public void manageAccount() {
        this.mentor.createAccount();
    }
}
