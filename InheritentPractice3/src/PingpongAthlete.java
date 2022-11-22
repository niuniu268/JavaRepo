public class PingpongAthlete extends Person implements PingPong, English{

    public PingpongAthlete() {
    }

    public PingpongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("speak english");
    }

    @Override
    public void playPingPong() {
        System.out.println("play ping pong ball");


    }






}
