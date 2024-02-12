package tn.iit.pattern.command.receiver;

public class Stereo {

    public void on() {
        System.out.println("The Stereo is On!");
    }

    public void setCD() {
        System.out.println("The Stereo will now play from CD");
    }

    public void setVolume(int i) {
        System.out.println("The stereo Volume is : " + i );
    }

    public void off() {
        System.out.println("The Stereo is Off!");
    }
}
