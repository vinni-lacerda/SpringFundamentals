package vinilab.springFundamentals.math;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vinilab.springFundamentals.exception.UnsupportedMathOperationException;

public class SimpleMath {
    public Double sum(Double numberOne, Double numberTwo){
          return (numberOne) + (numberTwo);
    }

    public Double subtract(Double numberOne, Double numberTwo){
        return (numberOne) - (numberTwo);
    }
    public Double multiply(Double numberOne, Double numberTwo){
        return (numberOne) * (numberTwo);
    }
    public Double divide(Double numberOne, Double numberTwo){
        return (numberOne) / (numberTwo);
    }

    public Double sqrRoot(Double numberOne){
        Double result = Math.sqrt(numberOne);
        return result;
    }
}
