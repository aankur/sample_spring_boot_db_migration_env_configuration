package com.sample.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "test")
@Data
public class TestEntity {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  Long id;

  String email;

  String comment;
}
