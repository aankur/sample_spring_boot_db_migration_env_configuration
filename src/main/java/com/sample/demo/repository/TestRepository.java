package com.sample.demo.repository;

import com.sample.demo.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "test")
public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
