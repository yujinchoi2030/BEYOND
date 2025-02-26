package com.beyond.restapi.department.model.dto;

import com.beyond.restapi.department.model.vo.Department;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class DepartmentRequestDto
{
    @Schema(description = "학과 이름", example = "일어학과")
    @NotBlank//(message = "null, \"\", \" \"(공백) 을 허용하지 않는다.")
    private final String name;

    @Schema(description = "계열", example = "인문사회")
    private final String category;

    @Schema(description = "개설 여부", example = "Y")
    @Pattern(regexp = "Y|N", message = "\"Y\" 또는 \"N\" 이여야 한다.")
    private final String openYn;

    @Schema(description = "정원", example = "50")
    @PositiveOrZero//(message = "0보다 크거나 같아야 한다.")
    // @@Positive = 양수만, @Negative = 음수만
    private final int capacity;

    public Department toDepartment()
    {
        return Department.builder()
                    .name(name)
                    .category(category)
                    .openYn(openYn)
                    .capacity(capacity)
                    .build();
    }
}
