import com.example.Animal;
import com.example.AnimalKind;
import com.example.Herbivore;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Тест класса Animal.
 */
public class AnimalTest {

    /**
     * Должна быть информация о семействе у животного.
     */
    @Test
    public void shouldAnimalHasFamilyInfo() {
        Assert.assertTrue(
            "Информация о семействе должна быть заполнена.",
            new Animal().getFamily().length() > 0
        );
    }

    /**
     * Список еды для хищника должен быть заполнен.
     */
    @Test
    public void shouldPredatorAnimalHasFood() throws Exception {
        Assert.assertTrue(
            "Список еды для хищника должен быть заполнен.",
            new Animal().getFood(Predator.animalKind).size() > 0
        );
    }

    /**
     * Список еды для травоядного должен быть заполнен.
     */
    @Test
    public void shouldHerbivoreAnimalHasFood() throws Exception {
        Assert.assertTrue(
            "Список еды для травоядного должен быть заполнен.",
            new Animal().getFood(Herbivore.animalKind).size() > 0
        );
    }

    /**
     * Должна быть ошибка, если список еды получается не для хищника и не для травоядного.
     */
    @Test
    public void shouldUnknownAnimalHasExceptionAboutFood() {
        String errorMessage = null;

        try {
            new Animal().getFood(AnimalKind.Unknown);
        }
        catch(Exception exception) {
            errorMessage = exception.getMessage();
        }

        Assert.assertNotEquals(
            "Получение списка еды для неизвестного животного должно вызвать ошибку.",
            null,
            errorMessage
        );
    }

}
