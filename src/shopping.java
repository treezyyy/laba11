import java.util.Scanner;

class shopping implements Product, User {
    private final Product product;
    private final User user;

    public shopping(Product product, User user) {
        this.product = product;
        this.user = user;
    }

    public void shopper() {
        System.out.println(user.getLogin() + " преобрёл товар " + product.getName());
    }

    @Override
    public void setName(String name) {
        product.setName(name);
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public void setPrice(double price) {
        product.setPrice(price);
    }

    @Override
    public double getPrice() {
        return product.getPrice();
    }

    @Override
    public void setRating(int rating) {
        product.setRating(rating);
    }

    @Override
    public int getRating() {
        return product.getRating();
    }

    @Override
    public String getLogin() {
        return user.getLogin();
    }

    @Override
    public void setLogin(String login) {
        user.setLogin(login);
    }

    @Override
    public String getPassword() {

        return user.getPassword();
    }

    @Override
    public void setPassword(String password) {
        user.setPassword(password);
    }
}