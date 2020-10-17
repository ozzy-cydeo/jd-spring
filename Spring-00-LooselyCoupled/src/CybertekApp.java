import Service.FullTimeMentor;
import Service.Mentor;

public class CybertekApp {
    public static void main(String[] args) {

        FullTimeMentor fulltime = new FullTimeMentor();

        Mentor mentor = new Mentor(fulltime);
        mentor.manageAccount();
    }
}
