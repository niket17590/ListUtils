package com.agrawal.niket.listutils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserObject {
    private String userName;
    private Integer userId;
    private Double userSalary;
}
