package tn.iit.pattern.observer.test;

import tn.iit.pattern.observer.alarm.Sonnerie1;
import tn.iit.pattern.observer.alarm.Sonnerie2;
import tn.iit.pattern.observer.alarm.SonnerieObserver;
import tn.iit.pattern.observer.chrono.AbstractChrono;
import tn.iit.pattern.observer.chrono.Chrono;
import tn.iit.pattern.observer.clock.DisplayAiguille;
import tn.iit.pattern.observer.clock.DisplayNumerique;
import tn.iit.pattern.observer.clock.DisplayObserver;

public class main {
        public static void main(String[] args) {
            AbstractChrono chrono = new Chrono();
            SonnerieObserver sonnerie1= new Sonnerie1(chrono );
            SonnerieObserver sonnerie2 = new Sonnerie2(chrono );
            chrono.registerSonnerieObserver(sonnerie1);
            chrono.registerSonnerieObserver(sonnerie2);
            DisplayObserver display1= new DisplayNumerique(chrono );
            DisplayObserver display2 = new DisplayAiguille(chrono );
            chrono.registerDisplayObserver(display1);
            chrono.registerDisplayObserver(display2);
            for(int i=3595;i<5000;i++)
            {
                try{Thread.sleep(1000);} catch(InterruptedException e) {System.out.print("erreur");}chrono.tick(i%60, (int)((i%3600)/60), (int)(i/3600));
            }}

}
