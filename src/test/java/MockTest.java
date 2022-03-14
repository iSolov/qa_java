import com.example.AnimalKind;
import com.example.Cat;
import com.example.Lion;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Различные тесты с импользованием моков.
 */
public class MockTest {

    @Mock
    Cat cat;

    @Mock
    Lion lion;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Для животного неизвестного вида должен быть пустой список еды вместо исключения.
     */
    @Test
    public void shouldBeEmptyFoodListForUnknownAnimalKind() throws Exception {
        Mockito.when(cat.getFood(AnimalKind.Unknown)).thenReturn(List.of());

        Assert.assertEquals(
            "Для неизвестного животного список еды должен быть пустым",
            0,
            cat.getFood(AnimalKind.Unknown).size()
        );
    }

    /**
     * Проверяет, что метод приема пищи вызывается успешно у льва.
     */
    @Test
    public void shouldLionEatMeat() throws Exception {
        lion.eatMeat();
        Mockito.verify(lion).eatMeat();
    }
}

