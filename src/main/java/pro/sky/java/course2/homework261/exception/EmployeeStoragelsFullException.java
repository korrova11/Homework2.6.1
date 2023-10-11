package pro.sky.java.course2.homework261.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED)
public class EmployeeStoragelsFullException extends RuntimeException {
    public EmployeeStoragelsFullException() {
    }
}
