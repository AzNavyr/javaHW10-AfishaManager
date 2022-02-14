package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BillboardFilm {
    private int id;
    private String name;
    private String genre;
    private String pictureUrl;
}
