package tn.iit.pattern.command.test;

import tn.iit.pattern.command.command.LightOffCommand;
import tn.iit.pattern.command.command.LightOnCommand;
import tn.iit.pattern.command.command.StereoOffCommand;
import tn.iit.pattern.command.command.StereoOnWithCDCommand;
import tn.iit.pattern.command.invoker.RemoteControl;
import tn.iit.pattern.command.receiver.Light;
import tn.iit.pattern.command.receiver.Stereo;

public class RemoteControleTest {
    public static void main(String arg[]) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light();
        LightOnCommand livingRoomLightOnCommand = new

                LightOnCommand(livingRoomLight);

        LightOffCommand livingRoomLightOffCommand = new

                LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.onButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();
        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCDCommand = new
                StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        System.out.println(remoteControl);
    }

}
