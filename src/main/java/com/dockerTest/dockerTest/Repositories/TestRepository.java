package com.dockerTest.dockerTest.Repositories;

import com.dockerTest.dockerTest.Entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository< Test, Long > {
}
