package escapeRoom;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Equipment> equipments = new ArrayList<>();

    public void add(Equipment equipment) {
        equipments.add(equipment);
    }

    public List<Equipment> remove(Equipment equipment) {
        equipments.remove(equipment);
        return equipments;
    }

    public boolean hasGotItem(Equipment equipment) {
        return equipments.contains(equipment);

    }
}
