package by.bztda.registration.service;

import by.bztda.registration.model.Employee;
import by.bztda.registration.dto.EmployeeRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface EmployeeService extends UserDetailsService {
    Employee save(EmployeeRegistrationDto registrationDto);
}
