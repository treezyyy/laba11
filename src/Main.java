public class Main {
    public static void main(String[] args) {
        Screen samsung = new Screen("Samsung", 123.3, 1);
        Keyboard logitech = new Keyboard("logitech", 100.7, 2);
        MousePad bloody = new MousePad("bloody", 160.7, 3);
        FirstSeller kirill = new FirstSeller("qwerty", "1324567");
        SecondSeller dima = new SecondSeller("qwerty1", "13245678");
        ThirdSeller nikita = new ThirdSeller("qwerty2", "132456789");
        shopping shopping = new shopping(samsung, dima);
        shopping.shopper();
    }
}
