package escapeRoom;

import java.util.List;

public class Game {
    private Place place;
    private Player player;
    private boolean gameOver;

    Game(Place place, Player player) {
        this.place = place;
        this.player = player;
    }

    List<Equipment> getEquipment() {
        return place.getEquipmentList();
    }

    Equipment findItem(String input) {
        return place.findItemByKind(input);
    }

    String useEquipment(Equipment equipment) {
        return equipment.use(new Context(place, player, this)); //TODO: Poczytaj o wzorcu Mediator
    }

    boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
