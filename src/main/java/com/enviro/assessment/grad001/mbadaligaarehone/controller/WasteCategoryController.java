package com.enviro.assessment.grad001.mbadaligaarehone.controller;

import com.enviro.assessment.grad001.mbadaligaarehone.dto.WasteCategoryDTO;
import com.enviro.assessment.grad001.mbadaligaarehone.model.WasteCategory;
import com.enviro.assessment.grad001.mbadaligaarehone.service.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/waste-categories")
public class WasteCategoryController {
    @Autowired
    private WasteCategoryService service;

    @PostMapping
    public ResponseEntity<WasteCategory> createCategory(@Validated @RequestBody WasteCategoryDTO dto) {
        WasteCategory category = service.createWasteCategory(dto);
        return ResponseEntity.ok(category);
    }

    @GetMapping
    public List<WasteCategory> getAllCategories() {
        return service.getAllWasteCategories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WasteCategory> getCategoryById(@PathVariable Long id) {
        return service.getWasteCategoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        service.deleteWasteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
