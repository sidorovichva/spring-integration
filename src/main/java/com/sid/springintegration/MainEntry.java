package com.sid.springintegration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MainEntry {

    @Id
    private String id;
    private String name;
}
