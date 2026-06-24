package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.sampleentity;

@Repository
public interface samplerepository extends JpaRepository<sampleentity,Integer> {
List<sampleentity> findById(int id);
}
