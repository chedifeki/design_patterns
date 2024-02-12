package tn.iit.pattern.command.command;

import tn.iit.pattern.command.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;
    public GarageDoorOpenCommand (GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute(){
        garageDoor.up();
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        System.out.print("Undoing : ");
        garageDoor.down();
        garageDoor.LightOff();
    }
}
