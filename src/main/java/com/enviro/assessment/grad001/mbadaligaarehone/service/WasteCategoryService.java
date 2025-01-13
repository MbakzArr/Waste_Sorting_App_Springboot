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

    public WasteCategory createWasteCategory(WasteCategoryDTO dto) {
        WasteCategory category = new WasteCategory();
        category.setCategoryName(dto.getCategoryName());
        category.setDisposalGuidelines(dto.getDisposalGuidelines());
        category.setRecyclingTips(dto.getRecyclingTips());

        // Save the category to the database
        return repository.save(category);
    }

    public List<WasteCategory> getAllWasteCategories() {
        return repository.findAll();
    }

    public Optional<WasteCategory> getWasteCategoryById(Long id) {
        return repository.findById(id);
    }

    public void deleteWasteCategory(Long id) {
        repository.deleteById(id);
    }
}
