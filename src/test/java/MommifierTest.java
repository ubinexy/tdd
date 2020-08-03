import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MommifierTest {

    @Test
    void should_return_origin_when_vowel_split_give_string_with_vowels_lower_then_30_percent() {
        Mommifier mommifier = new Mommifier();
        String expect = "zzz";
        Assertions.assertEquals(expect, mommifier.vowelSplit(expect));
    }

    @Test
    void should_insert_mommy_when_vowel_split_give_string_with_vowels_higher_then_30_percent() {
        Mommifier mommifier = new Mommifier();
        String origin = "hear";
        String expect = "hemommyar";
        Assertions.assertEquals(expect, mommifier.vowelSplit(origin));
    }
}
