package tn.iit.pattern.singleton.chocolate;

public class ChocolateBoiler{

    private boolean empty;

    private boolean boiled;

    private static final ChocolateBoiler INSTANCE = new ChocolateBoiler();

    public static ChocolateBoiler getInstance(){
        return INSTANCE;
    }
    private ChocolateBoiler() {

        empty=true; boiled=false;

    }

    public void fill(){

        if (empty){

            System.out.println("remplir la casserole avec du lait/chocolat");

            empty=false; boiled=false;

        }

    }

    public void boil(){

        if (!empty && !boiled){

            System.out.println("faire bouillir");

            boiled=true;

        }

    }

    public void drain(){

        if (!empty  && boiled){

            System.out.println("vider la casserole");

            empty=true;

        }

    }

}