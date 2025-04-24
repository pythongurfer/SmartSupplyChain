public abstract class Product{
    private String name;
    private String id;

    public Product(String id, String name){
        this.id = id;
        this.name = name;
    }
    // public getters and setters
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    //setters
    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name = name;
    }

    // metodo abstracto que deben implementar las sublases
    public abstract String getType();

    @Override
    public String toString() {
        return "Product{id='" + id + "', name='" + name + "'}";
    }
}