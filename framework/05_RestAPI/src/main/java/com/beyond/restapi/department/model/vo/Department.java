package com.beyond.restapi.department.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department
{
    private String no;

    private String name;

    private String category;

    private String openYn;

    private int capacity;
}
