package com.raki;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionsController {
    @GetMapping(path="/questions/{questionId}", produces=MediaType.TEXT_PLAIN_VALUE)
    public String getQuestion(@PathVariable String questionId) {
        return "Question "+questionId+ " description";
    }
    
    @PostMapping(path="/questions/{questionId}/solution", produces=MediaType.APPLICATION_JSON_VALUE)
    public BestPlanResponse getSolution(@PathVariable String questionId, @RequestBody BestPlanRequest payload) {
        BestPlanResponse bestPlan = getDummyResponseForParticularQuestion(payload);
        return bestPlan;
    }
    
    
    private BestPlanResponse getDummyResponseForParticularQuestion(BestPlanRequest payload) {
        BestPlanResponse bestPlan = new BestPlanResponse();
        payload.getAvailablePlans().stream().filter(plan->"PLAN1".equals(plan.getName()) || "PLAN3".equals(plan.getName()) ).forEach(bestPlan::addPlan);
        return bestPlan;
    }
}
