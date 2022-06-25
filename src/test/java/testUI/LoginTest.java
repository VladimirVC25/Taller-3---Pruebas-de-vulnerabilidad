package testUI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.todoistLogin;
import pages.todoistMain;
import pages.MenuSection;

import static config.EnvironmentConfig.pwd;
import static config.EnvironmentConfig.user;

public class LoginTest extends TestBase {
    todoistMain main = new todoistMain();
    todoistLogin login = new todoistLogin();
    MenuSection menu= new MenuSection();

    @DisplayName("Verify the login successfully")
    @Order(1)
    @Test
    public void verifyLoginTest() throws InterruptedException {
        main.btnLogin.click();
        login.emailtxt.setText(user);
        login.passwordtxt.setText(pwd);
        login.btnIniciarSesion.click();
        Thread.sleep(5000);
        Assertions.assertTrue(menu.lblBandejaEntrada.checkControlIsDisplayed(),
                "Bandeja de entrada" );
    }

}
