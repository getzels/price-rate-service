package com.capitole.repository;

import com.capitole.model.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;

@Repository
public interface PriceServiceRepository extends JpaRepository<Prices, Long> {

    @Query("""
        SELECT p
          FROM Prices p
         WHERE :date BETWEEN p.startDate and p.endDate
           AND p.brandId = :brandId
           AND p.productId = :productId 
         Order by p.priority desc
         limit 1 
    """)
    Prices findPriceByDateAndBrandIdAndProductId(@Param("date") ZonedDateTime date, @Param("brandId") Long brandId,
                                                 @Param("productId") Long productId);

}
