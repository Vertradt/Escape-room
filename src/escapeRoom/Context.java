package escapeRoom;

public class Context {
    private Place place;
    private Player activator;
    private Game system;

    public Context(Place place, Player activator, Game system) {
        this.place = place;
        this.activator = activator;
        this.system = system;
    }

    public void removeFromPlace(Equipment equipment) {
        place.remove(equipment);
    }

    public void addToActivator(Equipment equipment) {
        activator.add(equipment);
    }

    public boolean hasActivatorGotItem(Equipment equipment) {
        return activator.hasGotItem(equipment);
    }
    void endGame(){
        system.setGameOver(true);

    }


}
