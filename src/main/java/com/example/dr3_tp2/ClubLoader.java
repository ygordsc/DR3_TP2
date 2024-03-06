package com.example.dr3_tp2;

import com.example.dr3_tp2.model.domain.Club;
import com.example.dr3_tp2.model.service.ClubService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ClubLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        ClubService cs = new ClubService();

        cs.incluir(new Club("Flamengo", 1895));

        System.out.println(cs.obterLista());
        System.out.println(" ");

        cs.incluir(new Club("Cruzeiro", 1921));

        System.out.println(cs.obterLista());
        System.out.println(" ");

        cs.excluir("Flamengo");

        System.out.println(cs.obterLista());
        System.out.println(" ");

        System.out.println(cs.obter("Cruzeiro"));
    }
}
