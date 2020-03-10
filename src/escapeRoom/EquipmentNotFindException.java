package escapeRoom;

public class EquipmentNotFindException extends RuntimeException {
    public EquipmentNotFindException(String kind) {
        super("Obiekt typu " + kind + " nie został znaleziony");
    }
}
