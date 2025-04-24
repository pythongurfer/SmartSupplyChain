public  class Electronic extends Product{
    public Electronic{
        super(id, name)
    }
}   @Override
    public String getType() {
        return "Electronic";
    }

    @Overide
    public String toString() {
        return "Electronic{id='" + getId() + "', name=" + getName() + "'}");
    }
}