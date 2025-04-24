public class Perishable extends Product{
    private boolean isExpired;
    private int expirationDay;
    // Constructir
    public Perishable{
        super(id, name);
        this.expirationDay = expirationDay
    }
    // getters and setters for the extra parameter
    public int getExpirationDay() {
        return expirationDay;
    }
    public void setExpirationDay(){
        this.expirationDay = expirationDay;
    }

    public boolean isExpired(int today){
        return today > expirationDay;
    }

    // handling exception
    public void process(int today) throws ExpiredProductException {
        if (isExpired(today)) {
            throw new ExpiredProductException("Product " + getName() + " is expired");
        }
        System.out.println("Processing: " + getName());
    }



    @Override
    public String getType(){
        return "Perishable";
    }

    @Override
    public String toString(){
        return "Perishable{id='" + getId() + ", name=" + getName() + ", expiration=" + isExpired(today) = "'}";
    }
}