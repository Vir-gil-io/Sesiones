package mx.utng.session26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.session26.model.entity.Library;
import mx.utng.session26.model.service.ILibraryService;

@Controller
@SessionAttributes("library")
public class LibraryController {
    
    @Autowired
    private ILibraryService service;

    @GetMapping({"/library", "/library/", "/library/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Blibioteca");
        model.addAttribute("libraries", service.list());
        return "library-list";
    }

    @GetMapping("/library/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario prestamo bliblioteca");
        model.addAttribute("library", new Library());
        return "library-form";
    }

    @PostMapping("/library/form")
    public String save(@Valid Library library, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de Blibliotecas");
            return "library-form";
        }
        service.save(library);
        return "redirect:/library/list";
    }

    @GetMapping("/library/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Library library = null;
        if(id>0){
            library = service.getById(id);
        }else{
            return "redirect:/library/list";
        }
        model.addAttribute("title", "Editar Biblioteca");
        model.addAttribute("library", library);
        return "library-form";
    }

    @GetMapping("/library/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id > 0){
            service.delete(id);
        }
        return "redirect:/library/list";
    }



}