public class FirstSeller implements User{
    private String login;
    private String password;

    FirstSeller(String login, String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
