/**
 * @Author Mbadaliga Arehone
 *
 * A Data Transfer Object (DTO) for transferring waste category data between
 * different layers of the application. This class encapsulates the details
 * of a waste category, including its name, disposal guidelines, and recycling tips.
 */
package com.enviro.assessment.grad001.mbadaligaarehone.dto;

public class WasteCategoryDTO {

    /**
     * The name of the waste category (e.g., "Plastic").
     */
    private String categoryName;

    /**
     * Guidelines for proper disposal of waste in this category.
     */
    private String disposalGuidelines;

    /**
     * Tips for recycling waste in this category effectively.
     */
    private String recyclingTips;

    // Getters and Setters

    /**
     * Gets the name of the waste category.
     *
     * @return The name of the waste category.
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the name of the waste category.
     *
     * @param categoryName The name to set for the waste category.
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * Gets the disposal guidelines for the waste category.
     *
     * @return The disposal guidelines.
     */
    public String getDisposalGuidelines() {
        return disposalGuidelines;
    }

    /**
     * Sets the disposal guidelines for the waste category.
     *
     * @param disposalGuidelines The disposal guidelines to set.
     */
    public void setDisposalGuidelines(String disposalGuidelines) {
        this.disposalGuidelines = disposalGuidelines;
    }

    /**
     * Gets the recycling tips for the waste category.
     *
     * @return The recycling tips.
     */
    public String getRecyclingTips() {
        return recyclingTips;
    }

    /**
     * Sets the recycling tips for the waste category.
     *
     * @param recyclingTips The recycling tips to set.
     */
    public void setRecyclingTips(String recyclingTips) {
        this.recyclingTips = recyclingTips;
    }
}
