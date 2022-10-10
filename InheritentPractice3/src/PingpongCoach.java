public class PingpongCoach extends Person implements English, PingPong{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("speak english");

    }

    @Override
    public void playPingPong() {
        System.out.println("teach to play pingpong");

    }
}
