/**
 * @Author Mbadaliga Arehone
 *
 * Repository interface for managing {@link WasteCategory} entities. This interface
 * extends the {@link JpaRepository} to provide CRUD (Create, Read, Update, Delete)
 * operations and additional query capabilities for the WasteCategory entity.
 */
package com.enviro.assessment.grad001.mbadaligaarehone.repository;

import com.enviro.assessment.grad001.mbadaligaarehone.model.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Long> {
    // This interface inherits all CRUD and query method functionalities from JpaRepository.
}
