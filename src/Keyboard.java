public class Keyboard implements Product{
    private String name;
    private double price;
    private int rating;

    Keyboard(String name, double price, int rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
