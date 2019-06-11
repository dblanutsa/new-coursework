package dmitriy.blanutsa.coursework.services;import dmitriy.blanutsa.coursework.controllers.dto.ProfileDTO;import dmitriy.blanutsa.coursework.controllers.dto.RegisterRequest;import dmitriy.blanutsa.coursework.controllers.dto.ResetPasswordRequest;import dmitriy.blanutsa.coursework.persistance.models.Person;import org.springframework.validation.BindingResult;import java.util.List;public interface UserService {    String register(RegisterRequest request, BindingResult result);    ProfileDTO getProfile();    String changeProfile(ProfileDTO profileDTO, BindingResult result);    String resetPassword(ResetPasswordRequest request, BindingResult result);    List<Person> getListWithoutCurrent();}