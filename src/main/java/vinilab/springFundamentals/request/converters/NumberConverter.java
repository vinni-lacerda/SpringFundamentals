package vinilab.springFundamentals.request.converters;

import vinilab.springFundamentals.exception.UnsupportedMathOperationException;

public class NumberConverter {
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
}
