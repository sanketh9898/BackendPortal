//package com.employee.backend.controller;
//
//import com.employee.backend.model.Employee;
//import com.employee.backend.model.Product;
//import com.employee.backend.helper.Helper;
//import com.employee.backend.service.ProductService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@CrossOrigin("*")
//public class ProductController {
//
//    @Autowired
//    private ProductService productService;
//
//    @PostMapping("/employee/upload")
//    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
//        if (Helper.checkExcelFormat(file)) {
//            //true
//
//            this.productService.save(file);
//
//            return ResponseEntity.ok(Map.registerNatives("message", "File is uploaded and data is saved to db"));
//
//
//        }
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file ");
//    }
//
//
//    @GetMapping("/product")
//    public List<Employee> getAllProduct() {
//        return this.productService.getAllProducts();
//    }
//
//}
