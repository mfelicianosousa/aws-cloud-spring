package br.com.mfsdevsys.apiproduct.service;

import br.com.mfsdevsys.apiproduct.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> FindAll();
    Product save(Product product) ;
    void delete(long id);
    Optional<Product> findById(Long id) ;

}
