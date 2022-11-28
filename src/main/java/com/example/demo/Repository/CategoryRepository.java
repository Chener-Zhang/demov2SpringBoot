package com.example.demo.Repository;

import com.example.demo.Business.Model.posts.Category;
import com.example.demo.Business.Model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
