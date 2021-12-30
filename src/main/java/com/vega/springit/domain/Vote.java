package com.vega.springit.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class Vote extends Auditable {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private short direction;

    @NonNull
    @ManyToOne
    private Link link;

}
