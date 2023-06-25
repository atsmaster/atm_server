package com.han.atm.batter.repository;

import com.han.atm.batter.domain.BatterExecution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatterExecutionRepository extends JpaRepository<BatterExecution, String> {
}
