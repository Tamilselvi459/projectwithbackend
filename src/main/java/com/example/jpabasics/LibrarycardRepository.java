package com.example.jpabasics;

import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LibrarycardRepository  extends JpaRepository<LibraryCard , Integer> {
}
