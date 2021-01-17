package hello.core;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class HelloLombokTest {

    @Test
    void setterTest(){
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(27);
        assertThat(helloLombok.getAge()).isEqualTo(27);
    }

}