package com.raki;

import java.util.HashSet;
import java.util.Set;

public class BestPlanResponse {
    
    private Set<String> bestPlans = new HashSet<>();
    private long totalPrice=0;

    public void addPlan(Plan plan) {
        boolean added = bestPlans.add(plan.getName());
        if(added) {
            totalPrice+=plan.getPrice();
        }
    }
    
    public Set<String> getBestPlans(){
        return this.bestPlans;
    }
    
    public long getTotalPrice() {
        return this.totalPrice;
    }
}
