package tn.iit.pattern.command.command;

import tn.iit.pattern.command.receiver.Stereo;


public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo
                                         stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        System.out.print("Undoing : ");

        stereo.off();
    }
}