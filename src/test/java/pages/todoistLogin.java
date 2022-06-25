package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class todoistLogin {
    public TextBox emailtxt = new TextBox(By.id("labeled-input-1"),"[email] textbox in LoginTodoist");
    public TextBox passwordtxt = new TextBox(By.id("labeled-input-3"),"[password] textbox in LoginTodoist");
    public Button btnIniciarSesion = new Button(By.xpath("//*[@data-gtm-id='start-email-login']"),"[login] button in LoginTodoist");
}
