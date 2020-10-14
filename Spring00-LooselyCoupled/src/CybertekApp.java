import Service.FullTimeMentor;
import Service.MentorImplementor;

public class CybertekApp {
    public static void main(String[] args) {

        FullTimeMentor fulltime = new FullTimeMentor();

        MentorImplementor mentor = new MentorImplementor(fulltime);
        mentor.manageAccount();
    }
}
