public class Mentor {

    FullTimeMentor fullTime;
    PartTimeMentor partTime;
    //add MIMentor


    public Mentor(FullTimeMentor fullTime, PartTimeMentor partTime) {
        this.fullTime = fullTime;
        this.partTime = partTime;
    }

    public void manageAccount() {
        fullTime.createAccount();
        partTime.createAccount();
        //add MIMentor.createAccount();
    }
}
