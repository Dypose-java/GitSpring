package ru.dypose.spring.dao;

import org.springframework.stereotype.Component;
import ru.dypose.spring.models.Energy;

import java.util.ArrayList;
import java.util.List;

@Component
public class EnergyDAO {
    private List<Energy> energys = new ArrayList<>();

    {
        energys.add(new Energy(1, "Burn", "Яблоко киви"));
        energys.add(new Energy(2, "Burn", "Тропик"));
        energys.add(new Energy(3, "Burn", "Цитрус"));
        System.out.println(energys);
    }

    public List<Energy> getEnergys() {
        return energys;
    }

    public Energy energyById(int id) {
        return energys.stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .orElse(null);
    }


}
