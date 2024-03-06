package com.example.dr3_tp2;

import com.example.dr3_tp2.model.domain.Club;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClubTests {

    @Test
    void contextLoads() {
        Club c = new Club();

        c.setNome("Flamengo");

        c.setAno(1985);

        Assertions.assertEquals(1985, c.getAno());
    }

}
