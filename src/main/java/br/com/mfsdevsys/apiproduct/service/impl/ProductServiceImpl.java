package br.com.mfsdevsys.apiproduct.service.impl;

import br.com.mfsdevsys.apiproduct.entity.Product;
import br.com.mfsdevsys.apiproduct.repository.ProductRepository;
import br.com.mfsdevsys.apiproduct.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    // Injeção
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> FindAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(long id) {
      try{
          productRepository.deleteById( id );
      } catch (Exception e ) {
          throw new RuntimeException("Ocorreu um erro ao excluir o produto");
      }
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById( id );
    }
}
