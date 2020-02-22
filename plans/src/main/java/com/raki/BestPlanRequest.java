package com.raki;

import java.util.Set;

public class BestPlanRequest {
    Set<String> requiredFeatures;
    Set<Plan> availablePlans;
    
    public Set<String> getRequiredFeatures() {
        return requiredFeatures;
    }
    public void setRequiredFeatures(Set<String> requiredFeatures) {
        this.requiredFeatures = requiredFeatures;
    }
    public Set<Plan> getAvailablePlans() {
        return availablePlans;
    }
    public void setAvailablePlans(Set<Plan> availablePlans) {
        this.availablePlans = availablePlans;
    }
    @Override
    public String toString() {
        return "BestPlanRequest [requiredFeatures=" + requiredFeatures + ", availablePlans=" + availablePlans + "]";
    }
    
}
