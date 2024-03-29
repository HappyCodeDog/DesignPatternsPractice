package CreationalPatterns.PrototypePattern;

public abstract class Shape implements Cloneable {
    private String id;
    public String type;

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return clone;
    }
}
