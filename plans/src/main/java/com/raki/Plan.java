package com.raki;

import java.util.Set;

public class Plan {
    
    private String name;
    private Set<String> features;
    private long price;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<String> getFeatures() {
        return features;
    }
    public void setFeatures(Set<String> features) {
        this.features = features;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Plan [name=" + name + ", features=" + features + ", price=" + price + "]";
    }

    
    
}
