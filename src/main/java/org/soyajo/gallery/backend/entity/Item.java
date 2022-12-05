package org.soyajo.gallery.backend.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "items")
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50)
    private String imgPath;

    @Column
    private int price;

    @Column
    private int discountPer;
}
