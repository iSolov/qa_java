import com.example.Alex;
import org.junit.Assert;
import org.junit.Test;

public class AlexTest {
    /**
     * У Алекса должна быть грива.
     */
    @Test
    public void shouldAlexHasMane() throws Exception {
        Assert.assertTrue(
            "У Алекса должна быть грива.",
            new Alex().doesHaveMane()
        );
    }

    /**
     * У Алекса нет львят.
     */
    @Test
    public void shouldAlexHasNoKittens() throws Exception {
        Assert.assertEquals(
            "У Алекса не должно быть львят.",
            0,
            new Alex().getKittens()
        );
    }

    /**
     * У Алекса должны быть друзья.
     */
    @Test
    public void shouldAlexHasFriends() throws Exception {
        Assert.assertTrue(
            "У Алекса не должно быть львят.",
            new Alex().getFriends().size() > 0
        );
    }

    /**
     * У Алекса должно быть место жительства.
     */
    @Test
    public void shouldAlexHasPlaceOfLiving() throws Exception {
        Assert.assertFalse(
            "У Алекса должно быть место жительства.",
            new Alex().getPlaceOfLiving().isEmpty()
        );
    }
}
