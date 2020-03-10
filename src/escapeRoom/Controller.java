package escapeRoom;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private Game game;

    public Controller(Game game) {
        this.game = game;
    }

    void start() {
        do {
            handleException();
        } while (!game.isGameOver());
    }

    public void handleException() {
        try {
            pickAndUseItem();
        } catch (EquipmentNotFindException e) {
            System.out.println(e.getMessage());
        }

    }

    public void pickAndUseItem() {
        System.out.println("Dostępne przedmioty to:");
        showItems();
        String input = getStringInput("Wybierz przedmiot wpisując jego nazwę");
        Equipment item = findItem(input);
        useItem(item);
    }

    private void showItems() {
        List<Equipment> equipments = game.getEquipment();
        for (Equipment equipment1 : equipments) {
            System.out.println(equipment1);
        }
    }

    private String getStringInput(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine();
    }

    private Equipment findItem(String input) {
        System.out.println("Wyszukuję przedmiot " + input);
        Equipment equipment = game.findItem(input);
        System.out.println("Znaleziono przedmiot");
        return equipment;
    }

    private void useItem(Equipment item) {
        System.out.println("Używam przedmiotu");
        System.out.println(game.useEquipment(item));

    }


}
