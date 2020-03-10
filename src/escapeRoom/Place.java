package escapeRoom;

import java.util.ArrayList;
import java.util.List;

public abstract class Place {
    private List<Equipment> equipmentList = new ArrayList<>();

    public void add(Equipment equipment) {
        equipmentList.add(equipment);
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void remove(Equipment equipment) {
        equipmentList.remove(equipment);
    }

    public Equipment findItemByKind(String kind) {
        for (Equipment equipment : equipmentList) {
            if (equipment.getKind().equalsIgnoreCase(kind)) {
                return equipment;
            }
        }
        throw new EquipmentNotFindException(kind);
    }


}
