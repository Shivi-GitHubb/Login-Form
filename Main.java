public class Main {
    public static void main(String[] args) {

        IdAndPassword idandPassword = new IdAndPassword();
        LoginPage loginPage = new LoginPage(idandPassword.getLoginInfo());
    }
}