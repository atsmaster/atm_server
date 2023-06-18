package com.han.atm.batter.repository;

import com.han.atm.batter.domain.BatterGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatterGroupRepository extends JpaRepository<BatterGroup, String> {
}
