package spring_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring_mvc.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getCars(@RequestParam(value = "count", required = false) Integer count,
                          Model model) {

        model.addAttribute("cars", carService.getCarsByOrder(count));
        return "/cars";
    }
}
