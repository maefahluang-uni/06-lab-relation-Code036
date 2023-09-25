package th.mfu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.transaction.Transactional;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import th.mfu.domain.Concert;
import th.mfu.domain.Seat;

@Controller
public class ConcertController {
    // TODO: define repository for concert with @Autowired

    ConcertRepository concertRepo;

     // TODO: define repository for concert with @Autowired
    SeatRepository seatRepo;


    public ConcertController(ConcertRepository repository, SeatRepository seatRepository) {
        this.concertRepo = repository;
        this.seatRepo = seatRepository;
    }

    @InitBinder
    public final void initBinderUsuariosFormValidator(final WebDataBinder binder, final Locale locale) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @GetMapping("/concerts")
    public String listConcerts(Model model) {
        model.addAttribute("concerts", concertRepo.findAll());
        return "list-concert";
    }

    @GetMapping("/add-concert")
    public String addAConcertForm(Model model) {
        model.addAttribute("newconcert", new Concert());
        return "add-concert-form";
    }

    @PostMapping("/concerts")
    public String saveConcert(@ModelAttribute Concert newconcert) {
        concertRepo.save(newconcert);
        return "redirect:/concerts";
    }

    //TODO: add @Transactional
    public String deleteConcert(@PathVariable long id) {
        //TODO: delete related seats
        //TODO: delete concert from DB
        //TODO: redirect to /concerts list concerts
        return "";
    }

    public String showAddSeatForm(Model model, @PathVariable Long id) {

        //TODO: find seats by concert id
        //TODO: add found seats to model
        //TODO: find concert by id
        //TODO: define an empty seat
        //TODO: set concert to the empty seat
        //TODO: add newseat to the model
        //TODO: return a template for seat-mgmt
        return "";
    }

    
    public String saveSeat(@ModelAttribute Seat newseat, @PathVariable Long id) {
        //TODO: find concert by id
        //TODO: set concert to the new seat
        //TODO: save new seat
        //TODO: redict to /concerts/id/seats where id is concert id
        return "";
    }


}
