package br.com.mfsdevsys.apiproduct.repository;

import br.com.mfsdevsys.apiproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
