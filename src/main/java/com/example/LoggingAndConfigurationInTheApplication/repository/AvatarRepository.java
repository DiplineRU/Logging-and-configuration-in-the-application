package com.example.LoggingAndConfigurationInTheApplication.repository;

import com.example.LoggingAndConfigurationInTheApplication.model.Avatar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AvatarRepository extends JpaRepository<Avatar, Long> {
    Optional<Avatar> findByStudentId(Long studentId);

    Page<Avatar> findAll(Pageable pageable);


}

