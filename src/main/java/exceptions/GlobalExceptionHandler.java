package exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(VehiculoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleVehiculoNotFoundException(VehiculoNotFoundException ex) {
        return ex.getMessage();
    }
}