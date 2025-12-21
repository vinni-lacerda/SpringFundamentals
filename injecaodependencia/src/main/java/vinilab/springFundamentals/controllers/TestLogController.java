package vinilab.springFundamentals.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class TestLogController {

    private Logger logger = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping("/test")
    public String testlog(){
        logger.info("This is an info log");
        logger.debug("This is an debug log");
        logger.warn("This is an warn log");
        logger.error("This is an error log");
        return "Logs generated sucessfully!";
    }
}
