package com.example.entity;

import com.example.annotation.Experimental;
import com.example.util.ExpirationPredicate;
import java.io.Serializable;
import java.sql.*;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.persistence.*;
import lombok.Data;
import lombok.ToString;

/**
 * Note: auto-generated by jpa-entity-generator
 * TODO: This A/B testing mechanism is no longer used
 */
@Data
@ToString
@Deprecated
@Entity(name = "com.example.entity.ABTest")
@Table(name = "abtest")
public class ABTest implements Serializable, ExpirationPredicate {

  @Id
  @Nonnull
  @Column(name = "\"identifier\"", nullable = false, length = 50)
  private String identifier;
  @Nonnull
  @Column(name = "\"expiration_timestamp\"", nullable = false)
  private Integer expirationTimestamp;
  @Experimental(comment = "The expected data format is JSON")
  @Nullable
  @Column(name = "\"config\"", nullable = true, length = 2147483647)
  private String config;
}