import com.example.Cat;
import org.junit.Assert;
import org.junit.Test;

/**
 * Тестирования класса Кота.
 */
public class CatTest {

    /**
     * Список еды для кота не должен быть пустым.
     */
    @Test
    public void shouldCatHasFoodList() throws Exception {
        Assert.assertTrue(
            "Список еды кота не должен быть пуст.",
            new Cat().getFood().size() > 0
        );
    }

    /**
     * Кот должен как-то звучать.
     */
    @Test
    public void shouldCatSounds() {
        Assert.assertTrue("Кот должен как-то звучать.",
            new Cat().getSound().length() > 0
        );
    }
}
