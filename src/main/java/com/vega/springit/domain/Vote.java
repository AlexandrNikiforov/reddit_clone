package com.vega.springit.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Vote extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    private int vote;

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", vote=" + vote +
                '}';
    }

}
