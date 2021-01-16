package com.kisiEkleDuzenle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.kisiEkleDuzenle.entity.Person;

import com.kisiEkleDuzenle.service.PersonService;

@Controller
public class PersonController {
    private PersonService personService;

    @Autowired(required = true)
    @Qualifier(value="personService")
    public void setPersonService(PersonService ps) {
        this.personService = ps;
    }

    @RequestMapping("/KisiEkelemeFormu")
    public String showform(Model m) {
        m.addAttribute("command", new Person());
        return "KisiEkelemeFormu";
    }



    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("emp") Person person) {
        personService.save(person);
        return "redirect:/KisiListelemeFormu";
    }

    @RequestMapping("/KisiListelemeFormu")
    public String KisiListelemeFormu(Model m) {
        List<Person> list = personService.getPersons();
        m.addAttribute("list", list);
        return "KisiListelemeFormu";
    }

    @RequestMapping(value = "/KisiEkelemeFormu/{id}")
    public String edit(@PathVariable int id, Model m) {
        Person person = personService.getPersonById(id);
        m.addAttribute("command", person);
        return "kisiDuzenlemeFormu";
    }

    @RequestMapping(value = "/editsave", method = RequestMethod.POST)
    public String editsave(@ModelAttribute("emp") Person person) {
        personService.update(person);
        return "redirect:/KisiListelemeFormu";
    }

    @RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        personService.delete(id);
        return "redirect:/KisiListelemeFormu";
    }
}