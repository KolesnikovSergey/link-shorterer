package ru.kolesnikov.linkshorterer.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LINK")
@Data
@NoArgsConstructor
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Column(name = "long_link", nullable = false)
    private String longLink;

    @Column(name = "short_link", nullable = false)
    private String shortLink;

}
