public interface phone {

    void powerOn();
    void callNumber(String phoneNo);
    void receiveCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();

}
