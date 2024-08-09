import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestLogin {
    @Test
    public void openPage(){
        open("https://demoqa.com/login");
    }
}
