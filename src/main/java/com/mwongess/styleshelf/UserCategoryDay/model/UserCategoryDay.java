package com.mwongess.styleshelf.UserCategoryDay.model;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class UserCategoryDay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;

//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private Category category;

//    @OneToMany(mappedBy = "userCategoryDay", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<Photo> photos;
}
