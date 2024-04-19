package mx.utng.gfcg.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import mx.utng.gfcg.model.entity.Evaluacion;
import mx.utng.gfcg.model.service.IEvaluacionService;

@Controller
@SessionAttributes("evaluacion")
public class EvaluacionController {
    
    @Autowired
    private IEvaluacionService service;

    @GetMapping({"/evaluacion", "/evaluacion/", "/evaluacion/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Evaluaciones");
        model.addAttribute("evaluaciones", service.list());
        return "evalist";
    }

    @GetMapping("/evaluacion/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Evaluaciones");
        model.addAttribute("teacher", new Evaluacion());
        return "evaform";
    }

    @PostMapping("/evaluacion/form")
    public String save(Evaluacion evaluacion, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de Evaluaciones");
            return "evaform";
        }
        service.save(evaluacion);
        return "redirect:/evaluacion/list";
    }

    @SuppressWarnings("null")
    @GetMapping("/evaluacion/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Evaluacion evaluacion = null;
        if(id>0){
            evaluacion = evaluacion.getById(id);
        }else{
            return "redirect:/evaluacion/list";
        }
        model.addAttribute("title", "Editar Evaluacion");
        model.addAttribute("evaluacion", evaluacion);
        return "evaform";
    }

    @GetMapping("/evaluacion/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id > 0){
            service.delete(id);
        }
        return "redirect:/evaluacion/list";
    }



}
