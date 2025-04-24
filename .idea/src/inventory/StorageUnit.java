package inventory;

public class StorageUnit <T> {
    private T item;

    public void addItem(T item){
        if (item == null){
            throw new InvalidInputException("IT is not possible to add an empty field");

        }
        this.item = item;
        }

    public T getItem throws EmptyStorageException(){
        if (item == null){
            throw new EmptyStorageException("There is no product stored here");
        }
        return item;
    }

}
