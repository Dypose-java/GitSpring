package ru.dypose.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.dypose.spring.dao.EnergyDAO;

@Controller
@RequestMapping("/energy")
public class EnergyController {
    private EnergyDAO energyDAO;

    @Autowired
    public EnergyController(EnergyDAO energyDAO) {
        this.energyDAO = energyDAO;
    }

   @GetMapping
    public String energyAll(Model model){
        model.addAttribute("energys",energyDAO.getEnergys());
        return "energy/energyAll";
    }
    @GetMapping("/{id}")
    public String id(@PathVariable("id") int id,Model model){
        model.addAttribute("energy",energyDAO.energyById(id));
        return "energy/energyId";
    }
}
