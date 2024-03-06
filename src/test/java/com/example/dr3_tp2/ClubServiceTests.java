package com.example.dr3_tp2;
import com.example.dr3_tp2.model.domain.Club;
import com.example.dr3_tp2.model.service.ClubService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

public class ClubServiceTests {

    private ClubService cs;

    @BeforeEach
    void setUp() {
        cs = new ClubService();
    }

    @Test
    void Create() {
        Club a = new Club("Barcelona", 1902);

        cs.incluir(a);
    }

    @Test
    void Delete() {
        cs.excluir(null);
    }

    @Test
    void Recover() {
        cs.obter(null);
    }

}
