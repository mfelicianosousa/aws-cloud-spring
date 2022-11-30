package br.com.mfsdevsys.apiproduct.controller;

import br.com.mfsdevsys.apiproduct.entity.Product;
import br.com.mfsdevsys.apiproduct.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService ;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        var updateProduct = productService.findById(id);
        return ResponseEntity.ok( updateProduct.get() );
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok(productService.FindAll()) ;
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product){
        var newProduct = productService.save(product);

        return new ResponseEntity( product, HttpStatus.CREATED ) ;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        productService.delete(id);
        return ResponseEntity.ok().build();
    }


}
