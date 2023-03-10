import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class PosterManagerTest {
    PosterManager posterT = new PosterManager();

    @ParameterizedTest
    @CsvSource({"Аватар", "Блайд", "Трасформеры", "Титаник", "фыафыва"})
    public void shouldsetPosterTest(String post) {
        posterT.setPoster(post);
        String[] expected = new String[]{post};
        Assertions.assertArrayEquals(expected, posterT.getPoster());
    }

    @ParameterizedTest
    @CsvSource({"Аватар", "Блайд", "Трасформеры", "Титаник"})
    public void shouldReverseAllItems(String post) {
        posterT.setPoster(post);
        String[] expected = {"Титаник", "Трасформеры", "Блайд", "Аватар"};
        String[] actual =posterT.theLastAdded(4);
        Assertions.assertArrayEquals(expected, actual);
    }


}
