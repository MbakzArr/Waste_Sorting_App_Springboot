/**
 * @Author Mbadaliga Arehone
 *
 * Service class for managing waste categories. This class provides methods to create,
 * retrieve, and delete waste categories using the underlying {@link WasteCategoryRepository}.
 * It acts as the business logic layer in the application, interacting with the repository
 * and transforming data as needed.
 */
package com.enviro.assessment.grad001.mbadaligaarehone.service;

import com.enviro.assessment.grad001.mbadaligaarehone.dto.WasteCategoryDTO;
import com.enviro.assessment.grad001.mbadaligaarehone.model.WasteCategory;
import com.enviro.assessment.grad001.mbadaligaarehone.repository.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WasteCategoryService {

    @Autowired
    private WasteCategoryRepository repository;

    /**
     * Creates a new waste category and saves it to the database.
     *
     * @param dto The data transfer object containing the details of the waste category.
     * @return The saved {@link WasteCategory} entity.
     */
    public WasteCategory createWasteCategory(WasteCategoryDTO dto) {
        WasteCategory category = new WasteCategory();
        category.setCategoryName(dto.getCategoryName());
        category.setDisposalGuidelines(dto.getDisposalGuidelines());
        category.setRecyclingTips(dto.getRecyclingTips());

        // Save the category to the database
        return repository.save(category);
    }

    /**
     * Retrieves all waste categories from the database.
     *
     * @return A list of all {@link WasteCategory} entities.
     */
    public List<WasteCategory> getAllWasteCategories() {
        return repository.findAll();
    }

    /**
     * Retrieves a specific waste category by its unique identifier.
     *
     * @param id The unique identifier of the waste category.
     * @return An {@link Optional} containing the {@link WasteCategory} entity if found,
     *         or an empty {@link Optional} if not found.
     */
    public Optional<WasteCategory> getWasteCategoryById(Long id) {
        return repository.findById(id);
    }

    /**
     * Deletes a specific waste category from the database by its unique identifier.
     *
     * @param id The unique identifier of the waste category to delete.
     */
    public void deleteWasteCategory(Long id) {
        repository.deleteById(id);
    }
}
