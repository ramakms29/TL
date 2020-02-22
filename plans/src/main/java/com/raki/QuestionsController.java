package com.raki;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionsController {
    @GetMapping("/questions/{questionId}")
    public String getQuestion(@PathVariable String questionId) {
        return "Question "+questionId+ " description";
    }
}
