public class CybertekApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTime, partTime) ;

        mentor.manageAccount();

        //Let say one more mentor category added - MIMentor

    }
}
