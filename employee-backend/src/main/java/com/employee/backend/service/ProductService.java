package com.employee.backend.service;

import com.employee.backend.model.Employee;
import com.employee.backend.model.Product;
import com.employee.backend.repository.ProductRepo;
import com.employee.backend.helper.Helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public void save(MultipartFile file) {

        try {
            List<Employee> products = Helper.convertExcelToListOfProduct(file.getInputStream());
            this.productRepo.saveAll(products);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Employee> getAllProducts() {
        return this.productRepo.findAll();
    }


}
