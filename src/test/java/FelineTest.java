import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineTest {
    int kittensCount;
    Object expectedKittensCount;

    public FelineTest(int kittensCount, Object expectedKittensCount){
        this.kittensCount = kittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCountData() {
        return new Object[][] {
            { 0, 0},
            { 1, 1},
            { 100, 100 },
            { -1, Exception.class }
        };
    }

    @Test
    public void shouldFelineReturnKittens() {
        try {
            Object resultKittensCount = new Feline().getKittens(kittensCount);
            Assert.assertEquals("Количество котят вернуло неверное значение.", expectedKittensCount, resultKittensCount);
        }
        catch (Exception ex){
            Assert.assertEquals("Неправильное количество котят должно выдать ошибку.", expectedKittensCount, ex.getClass());
        }
    }

    @Test
    public void shouldFelineHaveFamily() {
        Assert.assertEquals(
            "Название семейства кошачьих отличается от " + Feline.FELINE_FAMILY,
            Feline.FELINE_FAMILY,
            new Feline().getFamily()
        );
    }
}
