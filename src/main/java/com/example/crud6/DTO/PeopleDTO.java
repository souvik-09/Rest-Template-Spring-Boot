package com.example.crud6.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeopleDTO {

    private Long id;
    private String name;
    private String email;
}
