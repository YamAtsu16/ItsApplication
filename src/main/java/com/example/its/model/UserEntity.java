package com.example.its.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserEntity {
    private long id;
    private String summary;
    private String description;
}
