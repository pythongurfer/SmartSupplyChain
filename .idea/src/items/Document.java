public class Document extends Product{
    public Document(String id, String name){
        super(id, name);
    }

    @Override
    public String getType(){
        return "Document";
    }

    @Override
    public String toString(){
        return "Document{id='" + getId() + "', name='" + getName() + "'}";
    }
}