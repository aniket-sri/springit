package com.aniket.springit.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Vote {

    @Id
    @GeneratedValue
    private Long id;
    private int vote;

    // link
    // user


}
