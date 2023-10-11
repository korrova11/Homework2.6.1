package pro.sky.java.course2.homework261.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/empl")

@RestController
public class EmployeeController {


    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;

    }


    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        Employee emp = new Employee(firstName, lastName);

        employeeService.addEmployee(emp);
        return emp;

    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        Employee emp = new Employee(firstName, lastName);

        employeeService.removeEmployee(emp);
        return emp;

    }

    @GetMapping("/find")
    public Employee containsEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        Employee emp = new Employee(firstName, lastName);

        return employeeService.containsEmployee(emp);

    }

    @GetMapping("/list")
    public List<Employee> listEmployees() {
        return employeeService.list();
    }


}




