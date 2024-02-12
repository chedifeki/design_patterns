package tn.iit.pattern.command.invoker;

import tn.iit.pattern.command.command.Command;

public class SimpleRemoteControl{
    private Command slot;

    public SimpleRemoteControl() {}
    public void setCommand(Command command ){
        slot=command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}