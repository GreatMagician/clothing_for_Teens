package shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alexander on 08.07.2017.
 */
@Controller
public class shopController {
    @RequestMapping("/shop")
    public String shop(){
        return "shop";
    }
}
