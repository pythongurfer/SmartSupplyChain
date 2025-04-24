public class Electronic extends Product {

    public Electronic(String id, String name) {
        super(id, name);
    }

    @Override
    public String getType() {
        return "Electronic";
    }

    @Override
    public String toString() {
        return "Electronic{id='" + getId() + "', name='" + getName() + "'}";
    }
}
