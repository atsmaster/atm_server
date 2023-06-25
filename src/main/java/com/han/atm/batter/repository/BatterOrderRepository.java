package com.han.atm.batter.repository;


import com.han.atm.batter.domain.BatterOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatterOrderRepository extends JpaRepository<BatterOrder, String> {
}
