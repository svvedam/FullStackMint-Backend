package com.mint.backend.mint.Repository;

import com.mint.backend.mint.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
