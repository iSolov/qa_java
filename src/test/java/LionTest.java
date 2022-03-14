import com.example.Feline;
import com.example.Lion;
import com.example.SexKind;
import org.junit.Assert;
import org.junit.Test;

public class LionTest {

    /**
     * Самец льва должен иметь гриву.
     */
    @Test
    public void shouldMaleLionHasMane() throws Exception {
        Assert.assertTrue(
            "Лев должен иметь гриву.",
            new Lion(SexKind.Male, new Feline()).doesHaveMane()
        );
    }

    /**
     * Самка льва не должна иметь гриву.
     */
    @Test
    public void shouldFemaleLionHasNoMane() throws Exception {
        Assert.assertFalse(
            "Львица не должна иметь гриву.",
            new Lion(SexKind.Female, new Feline()).doesHaveMane()
        );
    }

    /**
     * Лев неизвестного пола должен выдать ошибку.
     */
    @Test(expected = Exception.class)
    public void shouldLionWithIncorrectSexHasError() throws Exception {
        new Lion(SexKind.Unknown, new Feline());
    }

    /**
     * Список еды у льва должен быть заполнен.
     */
    @Test()
    public void shouldLionHasFood() throws Exception {
        Assert.assertTrue(
            "У льва должен быть список еды.",
            new Lion(SexKind.Male, new Feline()).eatMeat().size() > 0
        );
    }
}
