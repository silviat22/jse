package com.example.jse.m07.s02;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleMaxTest2 {

    @Test
    void maxStandard() {
        int[] input = { 1, 2, 3, 4, 5 };
        int expected = 5;
        int actual = Example.max(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void maxNull() { // la freccia (lamdba, funz. anonima prog. funzionale): isThby è un metodo a cui è passata la funzione dopo la freccia, la esegue e vede che succede
        assertThatIllegalArgumentException().isThrownBy(() -> Example.max(null));
    }

    @Test
    void maxNullClassic() {
        try {
            Example.max(null);
            fail("Eccezione attesa");
        } catch (IllegalArgumentException ex) {
            assertThat(ex.getMessage()).isEqualTo("Bla bla");
        }
    }
}
