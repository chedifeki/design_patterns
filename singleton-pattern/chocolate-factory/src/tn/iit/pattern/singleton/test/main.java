package tn.iit.pattern.singleton.test;

import tn.iit.pattern.singleton.chocolate.ChocolateBoiler;

public class main {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
