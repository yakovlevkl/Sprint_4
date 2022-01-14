import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountParamTest {
    private final String name;
    private final Boolean status;
    private Account account;

    public AccountParamTest(String name, Boolean status) {
        this.name = name;
        this.status = status;
    }

    @Parameterized.Parameters
    public static Object[] getStatus() {
        return new Object[][] {
                { "Тимоти Шаламе", true},
                { "Т а", true},
                { "ТимотиШаламе", false},
                { "ТимотиШаламе ", false},
                { " ТимотиШаламе", false},
                { " Тимоти Шаламе", false},
                { "Тимоти Шаламе ", false},
                { "Ти", false},
                { "ТимотиШаламеТимотиШаламе", false},
                { "Ти мо ти Шаламе", false},
                { " ", false},
                { null , false},
        };
    }

    @Step("Проверка имени {name}")
    public void setUp(String name){
        account = new Account(name);
    }

    @Test
    @Feature("Контроль корректности именования банковской карты")
    @DisplayName("Проверка имени")
    public void testCheckNameCard() {
        setUp(name);
        assertEquals(status, account.checkNameToEmboss());
    }

}
