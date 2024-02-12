package tn.iit.pattern.command.command;

import tn.iit.pattern.command.receiver.Light;

public class LightOffCommand implements Command {
    private final Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        System.out.print("Undoing : ");
        light.on();
    }
}
