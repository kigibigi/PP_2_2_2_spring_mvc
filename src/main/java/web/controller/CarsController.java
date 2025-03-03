package web.controller;

import dao.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/cars")
public class CarsController {

    private final CarDAO carDAO;

    @Autowired
    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping("cars")
    public String order(@RequestParam(value = "count", required = false) Integer count,
                        Model model) {
        if (count != null) {
            model.addAttribute("cars", carDAO.getCarsByOrder(count));
        } else {
            model.addAttribute("cars", carDAO.getCars());
        }
        return "/cars";
    }
}
