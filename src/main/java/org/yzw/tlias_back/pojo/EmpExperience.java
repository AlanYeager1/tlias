package org.yzw.tlias_back.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpExperience {
    private Integer id;
    private Integer emp_id;
    private LocalDate begin;
    private LocalDate end;
    private String company;
    private String job;
}
