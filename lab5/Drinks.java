abstract class Drinks{
    protected void pour(int qty){
        System.out.println("add "+qty+"ml of drink");
    }
     abstract void addCondiment();
     void stir(){}
    protected void serve(){
        System.out.println("served by waiter");
    }
    public void templatemethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}