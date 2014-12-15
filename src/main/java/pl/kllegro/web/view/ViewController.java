package pl.kllegro.web.view;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by karol on 15.12.14.
 */
@Controller
public class ViewController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getHomePage(Model model){
        return "home";
    }
}
