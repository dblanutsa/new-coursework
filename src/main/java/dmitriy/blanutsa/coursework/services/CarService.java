package dmitriy.blanutsa.coursework.services;import dmitriy.blanutsa.coursework.controllers.dto.CarRequest;import dmitriy.blanutsa.coursework.persistance.models.Car;import org.springframework.ui.Model;import org.springframework.validation.BindingResult;import java.util.List;public interface CarService {    String getList(Model model);    String add(CarRequest request, BindingResult result, Model model);    List<Car> getCurrentCars();    void setModelCreateObject(Model model);}