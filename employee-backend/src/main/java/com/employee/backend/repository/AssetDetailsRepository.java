package com.employee.backend.repository;

import com.employee.backend.model.AssetDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetDetailsRepository extends JpaRepository<AssetDetails, String> {

    public List<AssetDetails> findAll();

    public AssetDetails findById(Integer empId);
}
