public class Perishable extends Product {
    private int expirationDay;

    public Perishable(String id, String name, int expirationDay) {
        super(id, name);
        this.expirationDay = expirationDay;
    }

    public int getExpirationDay() {
        return expirationDay;
    }

    public void setExpirationDay(int expirationDay) {
        this.expirationDay = expirationDay;
    }

    public boolean isExpired(int today) {
        return today > expirationDay;
    }

    public void process(int today) throws ExpiredProductException {
        if (isExpired(today)) {
            throw new ExpiredProductException("Product " + getName() + " is expired.");
        }
        System.out.println("Processing: " + getName());
    }

    @Override
    public String getType() {
        return "Perishable";
    }

    @Override
    public String toString() {
        return "Perishable{id='" + getId() + "', name='" + getName() + "', expires=" + expirationDay + "}";
    }
}
