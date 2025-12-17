package vinilab.springFundamentals.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vinilab.springFundamentals.exception.UnsupportedMathOperationException;
import vinilab.springFundamentals.math.SimpleMath;
import vinilab.springFundamentals.request.converters.NumberConverter;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        if(!NumberConverter.IsNumeric(numberOne) || !NumberConverter.IsNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
        }

    @RequestMapping("/subtract/{numberOne}/{numberTwo}")
    public Double subtract(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        if(!NumberConverter.IsNumeric(numberOne) || !NumberConverter.IsNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.subtract(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping("/multi/{numberOne}/{numberTwo}")
    public Double multiply(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        if(!NumberConverter.IsNumeric(numberOne) || !NumberConverter.IsNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.multiply(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping("/divide/{numberOne}/{numberTwo}")
    public Double divide(@PathVariable String numberOne, @PathVariable String numberTwo) throws Exception {
        if(!NumberConverter.IsNumeric(numberOne) || !NumberConverter.IsNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.divide(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping("/sqrt/{numberOne}")
    public Double sqrRoot(@PathVariable String numberOne) throws Exception {
        if(!NumberConverter.IsNumeric(numberOne))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        Double result = Math.sqrt(NumberConverter.convertToDouble(numberOne));
        return result;
    }
}
