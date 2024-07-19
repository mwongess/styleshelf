package com.mwongess.styleshelf.photo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

//    @ManyToOne
//    @JoinColumn(name = "user_category_day_id")
//    private UserCategoryDay userCategoryDay;
}

