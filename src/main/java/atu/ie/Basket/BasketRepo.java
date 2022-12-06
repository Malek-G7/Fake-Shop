package atu.ie.Basket;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepo extends JpaRepository<Basket,Long>{
    public Basket findByItemName(String itemName);
    public void deleteById(Long count);
}
