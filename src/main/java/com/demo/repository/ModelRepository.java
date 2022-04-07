package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.ModelEntity;

public interface ModelRepository extends JpaRepository<ModelEntity, Integer> {

}
