/**
 * @Author Mbadaliga Arehone
 *
 * Represents a waste category in the system, used to define the type of waste
 * and provide guidelines for disposal and recycling tips.
 *
 * This entity is mapped to a database table using JPA annotations.
 */
package com.enviro.assessment.grad001.mbadaligaarehone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class WasteCategory {

    /**
     * The unique identifier for the waste category.
     * Auto-generated using the IDENTITY strategy.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the waste category (e.g., "Plastic").
     */
    private String categoryName;

    /**
     * Guidelines for proper disposal of the waste in this category.
     */
    private String disposalGuidelines;

    /**
     * Tips for recycling the waste in this category effectively.
     */
    private String recyclingTips;

    // Getters and Setters

    /**
     * Gets the unique identifier for this waste category.
     *
     * @return The ID of the waste category.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier for this waste category.
     *
     * @param id The ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the name of this waste category.
     *
     * @return The name of the category.
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the name of this waste category.
     *
     * @param categoryName The name of the category to set.
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * Gets the disposal guidelines for this waste category.
     *
     * @return The disposal guidelines.
     */
    public String getDisposalGuidelines() {
        return disposalGuidelines;
    }

    /**
     * Sets the disposal guidelines for this waste category.
     *
     * @param disposalGuidelines The disposal guidelines to set.
     */
    public void setDisposalGuidelines(String disposalGuidelines) {
        this.disposalGuidelines = disposalGuidelines;
    }

    /**
     * Gets the recycling tips for this waste category.
     *
     * @return The recycling tips.
     */
    public String getRecyclingTips() {
        return recyclingTips;
    }

    /**
     * Sets the recycling tips for this waste category.
     *
     * @param recyclingTips The recycling tips to set.
     */
    public void setRecyclingTips(String recyclingTips) {
        this.recyclingTips = recyclingTips;
    }
}
