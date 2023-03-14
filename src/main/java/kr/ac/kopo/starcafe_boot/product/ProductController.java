package kr.ac.kopo.starcafe_boot.product;

import kr.ac.kopo.starcafe_boot.entity.ProductEntity;
import kr.ac.kopo.starcafe_boot.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("product")
public class ProductController {
    final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @RequestMapping("/list")
    public String list(Model model) {

        List<ProductEntity> productList = service.list();
        model.addAttribute("list", productList);

        return "product/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        service.delete(id);

        return "redirect:/product/list";
    }

    @GetMapping("/add")
    public String create() {


        return "product/add";
    }

    @PostMapping("/add")
    public String create(ProductVo vo) {
        service.save(vo);
        return "redirect:/product/list";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        Optional<ProductEntity> updateTarget = service.selectOne(id);
        model.addAttribute("updateTarget", updateTarget.get());
        System.out.println(updateTarget);
        return "product/update";
    }

    @PostMapping("/update/{id}")
    public String updateSave(@PathVariable int id, ProductVo vo) {

        service.updateSave(id, vo);

        return "redirect:/product/list";
    }
}
