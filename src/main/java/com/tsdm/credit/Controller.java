package com.tsdm.credit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Logger logger = LoggerFactory.getLogger(Controller.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testApp()
    {
        System.out.println("Gaurav");
        String result = "Credit App Tested";
        logger.info(result);
        return result;
    }
}
