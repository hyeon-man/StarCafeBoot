package kr.ac.kopo.starcafe_boot.Root;


import kr.ac.kopo.starcafe_boot.entity.ProductEntity;
import kr.ac.kopo.starcafe_boot.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
