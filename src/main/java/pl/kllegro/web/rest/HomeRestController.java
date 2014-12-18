package pl.kllegro.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by karol on 15.12.14.
 */
@RestController
@RequestMapping(value = "/rest")
public class HomeRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeRestController.class);
    @RequestMapping(method = RequestMethod.GET,produces = "application/json")
    public String isWork(){
        return "{isWork:true}";
    }

}
