package tn.iit.pattern.command.invoker;

import tn.iit.pattern.command.command.Command;
import tn.iit.pattern.command.command.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();

        for(int i=0;i<7;i++){

            onCommands[i] = noCommand;
            offCommands[i] = noCommand;

        }
        undoCommand = noCommand;
    }
    public void setCommand(int slot, Command onCommand,Command offCommand ){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    @Override
    public String toString(){

        String s="";
        for(int i=0;i<7;i++){

            s+="Slot["+i+"] "+onCommands[i].getClass().getName() +" "+offCommands[i].getClass().getName()+"\n";
        } return s;
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
}
