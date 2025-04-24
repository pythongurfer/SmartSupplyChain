public abstract class Product{
    Private String name;
    Private String id;

    public Product(String id, String name){
        this.id = id;
        this.name = name;
    }
    // public getters and setters
    public static String getId(){
        return id;
    }
    public static String getName{
        return name;
    }

    //setters
    public static void setId{
        this.id=id;
    }
    public static void getName{
        this.name = name;
    }

    // metodo abstracto que deben implementar las sublases
    public abstract String getType();

    @Override
    public String toString() {
        return "Product{id='" + id + "', name='" + name + "'}";
    }
}