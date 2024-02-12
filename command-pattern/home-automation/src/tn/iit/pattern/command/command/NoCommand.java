package tn.iit.pattern.command.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Ce Bouton n'est pas programmé!");
    }

    @Override
    public void undo() {
        System.out.println("Aucune Commande a annuler!");
    }
}
