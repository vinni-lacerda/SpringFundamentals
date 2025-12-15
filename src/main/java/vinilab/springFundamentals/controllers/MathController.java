package vinilab.springFundamentals.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vinilab.springFundamentals.exception.UnsupportedMathOperationException;

@RestController
@RequestMapping("/math")
public class MathController {
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        if(!IsNumeric(numberOne) || !IsNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
        }
    public static double convertToDouble(String strNumber) throws Exception {
        if(strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("Please set a numeric value");;
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    public static boolean IsNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return (number.matches("[-+]?[0-9]*\\.?[0-9]+"));
    }
    @RequestMapping("/subtract/{numberOne}/{numberTwo}")
    public Double subtract(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        if(!IsNumeric(numberOne) || !IsNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }
}
