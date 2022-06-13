package sampleProj;

public class ClassListSub {

    private String name;
    private int number;
    private int price;

    public String getName() {
    return this.name;
    }
    public int getNumber() {
        return this.number;
    }
    public int getPrice() {
        return this.price;
    }

    public ClassListSub(String name, int number, int price){
        this.name = name;
        this.number = number;
        this.price = price;
    }

}
