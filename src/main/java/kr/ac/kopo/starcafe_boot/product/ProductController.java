package kr.ac.kopo.starcafe_boot.product;

import kr.ac.kopo.starcafe_boot.entity.ProductEntity;
import kr.ac.kopo.starcafe_boot.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @RequestMapping("/list")
    public String list(Model model){

        List<ProductEntity> productList = service.list();
        model.addAttribute("list", productList);

        return "product/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){

        service.delete(id);

        return "redirect:/product/list";
    }

    @GetMapping("/create")
    public String create(){


        return "product/add";
    }

    @PostMapping("/create")
    public String create(ProductVo vo){


     service.save(vo);

     return "redirect:/product/list";
    }
}
