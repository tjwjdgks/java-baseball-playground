package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    @Test
    void splitDone(){
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1","2");
    }
    @Test
    void splitNotDone(){
        String[] actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }
    @Test
    void subString(){
        String actual = "(1,2)".substring(1,4);
        assertThat(actual).isEqualTo("1,2");
    }
    @DisplayName("위치값 가져오기")
    @Test
    void charAt(){
        char c = "abc".charAt(0);
        assertThat(c).isEqualTo('a');
    }
    @DisplayName("위치값 exception 1")
    @Test
    void charAtErrorV1(){
        assertThatThrownBy(()->{
            char c = "abc".charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
          .hasMessage("String index out of range: 4");
    }
    @DisplayName("위치값 exception 2")
    @Test
    void charAtErrorV2(){
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(()->{
                    char c = "abc".charAt(4);
                }).withMessageMatching("String index out of range: \\d+");
    }
}

