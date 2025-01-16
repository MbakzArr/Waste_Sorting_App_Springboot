/**
 * @Author Mbadaliga Arehone
 *
 * REST controller for managing waste categories. This controller provides endpoints
 * to create, retrieve, and delete waste categories. It acts as the entry point for
 * handling HTTP requests related to waste category management.
 */
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

    /**
     * Creates a new waste category.
     *
     * @param dto The {@link WasteCategoryDTO} containing the details of the waste category to create.
     * @return A {@link ResponseEntity} containing the created {@link WasteCategory}.
     */
    @PostMapping
    public ResponseEntity<WasteCategory> createCategory(@Validated @RequestBody WasteCategoryDTO dto) {
        WasteCategory category = service.createWasteCategory(dto);
        return ResponseEntity.ok(category);
    }

    /**
     * Retrieves all waste categories.
     *
     * @return A list of all {@link WasteCategory} entities.
     */
    @GetMapping
    public List<WasteCategory> getAllCategories() {
        return service.getAllWasteCategories();
    }

    /**
     * Retrieves a specific waste category by its unique identifier.
     *
     * @param id The unique identifier of the waste category.
     * @return A {@link ResponseEntity} containing the {@link WasteCategory} if found,
     *         or a 404 Not Found response if the category does not exist.
     */
    @GetMapping("/{id}")
    public ResponseEntity<WasteCategory> getCategoryById(@PathVariable Long id) {
        return service.getWasteCategoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Deletes a specific waste category by its unique identifier.
     *
     * @param id The unique identifier of the waste category to delete.
     * @return A {@link ResponseEntity} with a 204 No Content status if the category
     *         was successfully deleted.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        service.deleteWasteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
