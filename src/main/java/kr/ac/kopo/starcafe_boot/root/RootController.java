package kr.ac.kopo.starcafe_boot.root;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
    final RootService service;

    public RootController(RootService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String index() {
        service.dummyCreate();

        return "/index";
    }

}
