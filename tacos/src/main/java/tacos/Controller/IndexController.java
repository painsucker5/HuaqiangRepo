package tacos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @author BingShuai Liu
 * @date 2021/09/21/1:13
 * @description
 */
@Controller
public class IndexController {
    @GetMapping("/home")
    public String test3() {
        return "home";
    }
}