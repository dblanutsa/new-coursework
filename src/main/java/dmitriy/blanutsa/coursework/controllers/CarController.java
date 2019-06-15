package dmitriy.blanutsa.coursework.controllers;import dmitriy.blanutsa.coursework.controllers.dto.CarRequest;import dmitriy.blanutsa.coursework.services.CarService;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.validation.BindingResult;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.ModelAttribute;import org.springframework.web.bind.annotation.PostMapping;import javax.validation.Valid;@Controllerpublic class CarController {    private final CarService service;    public CarController(CarService service) {        this.service = service;    }    @GetMapping("/cars")    private String models(Model model) {        return service.getList(model);    }    @GetMapping("/addCar")    private String addModel(Model model) {        service.setModelCreateObject(model);        return "addCar";    }    @PostMapping("/addCar")    private String addModel(@ModelAttribute("car") @Valid CarRequest request, BindingResult result, Model model) {        return service.add(request, result, model);    }}