package com.lat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.lat.entity.Category;
import com.lat.entity.Product;
import com.lat.service.CategoryService;
import com.lat.service.ProductService;

@Controller
public class AdminController {
	
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;
    
	
	@GetMapping("/admin") 
	public String admin() { 
		return "admin/adminHome"; 
	}
	 

    @GetMapping("/admin/products")
    public String manageProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        model.addAttribute("categories", categoryService.getAllCategories());
        model.addAttribute("product", new Product());
        return "admin/products";
    }

    @PostMapping("/admin/products/add")
    public String addProduct(Product product) {
        productService.addProduct(product);
        return "redirect:/admin/products";
    }

    @PostMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/admin/products";
    }

    @GetMapping("/admin/categories")
    public String manageCategories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        model.addAttribute("category", new Category());
        return "admin/categories";
    }

    @PostMapping("/categories/add")
    public String addCategory(Category category) {
        categoryService.addCategory(category);
        return "redirect:/admin/categories";
    }

    @PostMapping("/categories/delete/{id}")
    public String deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return "redirect:/admin/categories";
    }
    @GetMapping("/shop/admin")
    public String viewProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        boolean isAdmin = false;
        
		/*
		 * // Check if user is an admin if (principal != null &&
		 * userService.isAdmin(principal.getName())) { isAdmin = true; }
		 */

        model.addAttribute("products", products);
        model.addAttribute("isAdmin", isAdmin);
        return "products";
    }

}

