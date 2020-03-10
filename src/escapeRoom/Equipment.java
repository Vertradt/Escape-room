package escapeRoom;

public abstract class Equipment {
    private String kind;
    private String state;
    public Equipment(String kind) {
        this.kind = kind;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {

        return state;
    }

    abstract String use(Context context);

    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return kind;
    }
}
