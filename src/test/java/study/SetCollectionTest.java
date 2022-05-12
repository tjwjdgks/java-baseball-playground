package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetCollectionTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void setSize(){
        assertThat(numbers.size()).isEqualTo(3);
    }
    @Test
    void containsV1(){
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }
    @DisplayName("ParameterizedTestAllTrue")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void containsV2(int input){
        assertThat(numbers.contains(input)).isTrue();
    }
    @DisplayName("ParamterizedTestWithCsv")
    @ParameterizedTest
    @CsvSource(value = {"1:True","2:True","3:True","4:False","5:False"},delimiter = ':')
    void containsV3(int input,boolean expected){
        assertThat(numbers.contains(input)).isEqualTo(expected);
    }
}
