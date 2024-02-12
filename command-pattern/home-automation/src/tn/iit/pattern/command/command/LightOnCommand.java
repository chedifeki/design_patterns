package tn.iit.pattern.command.command;

import tn.iit.pattern.command.receiver.Light;

public class LightOnCommand implements Command {
    private final Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute(){
        light.on();
    }

    @Override
    public void undo() {
        System.out.print("Undoing : ");
        light.off();
    }
}