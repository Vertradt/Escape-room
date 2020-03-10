package escapeRoom;

public class Key extends Equipment {
    public Key() {
        super("klucz");

    }

    @Override
    String use(Context context) {
        context.removeFromPlace(this);
        context.addToActivator(this);
        return "Klucz został zabrany";
    }

//    @Override
//    public String getState() {
//        return super.getState();
//    }
}
