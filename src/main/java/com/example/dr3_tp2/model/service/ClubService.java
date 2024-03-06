package com.example.dr3_tp2.model.service;
import com.example.dr3_tp2.model.domain.Club;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClubService {

    public Map<String, Club> clubs = new HashMap<String, Club>();

    public void incluir(Club c) {
        clubs.put(c.getNome(), c);
    }

    public void excluir(String n) {
        clubs.remove(n);
    }

    public Collection<Club> obterLista() {
        return clubs.values();
    }

    public Club obter(String n) {
        return clubs.get(n);
    }


}
