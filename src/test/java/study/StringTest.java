package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    @DisplayName("문자 대체")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split 테스트")
    void splitNumbers() {
        String[] actual = "1,2".split(",");
        String[] expected = new String[]{"1","2"};

        assertThat(actual).containsExactly(expected);
        assertThat(actual).contains("1", "2");
    }

    @Test
    @DisplayName("문자열에 없는 문자로 split")
    void splitNumber() {
        String[] actual = "1".split(",");
        String[] expected = new String[]{"1"};

        assertThat(actual).containsExactly(expected);
    }

    @Test
    @DisplayName("substring 테스트")
    void substring() {
        String actual = "(1,2)".substring(1, 4);
        String expected = "1,2";

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("charAt 특정 인덱스에 있는 char 확인하기")
    void charAt() {
        char actual = "abc".charAt(1);
        char expected = 'b';

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    @DisplayName("charAt OutOfIndex Exception")
    void charAtThrowOutOfIndexException() {
        assertThatThrownBy(() -> "abc".charAt(5))
            .isInstanceOf(StringIndexOutOfBoundsException.class)
            .hasMessageContaining("String index out of range:");
    }



}
