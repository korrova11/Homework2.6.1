package pro.sky.java.course2.homework261.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/empl")
@RestController
public class EmployeeController {


    private final EmployeeService employeeService;
    private final Employee employee;

    public EmployeeController(EmployeeService employeeService, Employee employee) {
        this.employeeService = employeeService;
        this.employee = employee;
    }


    @GetMapping(path = "/empl/add")
    public String addEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        return employeeService.addEmployee(employee1);


    }


}

