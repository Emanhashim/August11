package com.bazra.usermanagement.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bazra.usermanagement.model.Promotion;


@Repository
@Transactional(readOnly = true)
public interface PromotionRepository extends JpaRepository<Promotion, Integer> {
	Optional<Promotion> findByTitle(String title);
	Optional<Promotion> findByExpirationDate(LocalDate date);
	Optional<Promotion> findByStatus(Boolean status);
	Optional<Promotion> findById(int id);

}
