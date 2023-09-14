package com.prosbook.springbootlibrary.requestmodels;

import lombok.Data;

import java.util.Optional;

@Data
public class ReviewRequest {

    private double rating;

    private Long bookId;

    private Optional<String> reviewDescription;

    @Data
    public static class AdminQuestionRequest {

        private Long id;

        private String response;
    }
}
