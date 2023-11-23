package com.example.entity5;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;
import lombok.ToString;

/**
 * Note: auto-generated by jpa-entity-generator
 */
@Data
@ToString
@Entity(name = "com.example.entity5.BlogArticle")
@Table(name = "article")
public class BlogArticle implements Serializable {

  public Integer getId() { return this.id; }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"name\"", nullable = true)
  private String name;
  @Deprecated
  @Column(name = "\"tags\"", nullable = true)
  private Clob tags;
  @Column(name = "\"created_at\"", nullable = false)
  private Timestamp createdAt;
  @ManyToOne
  @JoinColumn(name = "\"blog_id\"", referencedColumnName = "\"id\"", insertable = false, updatable = false)
  private Blog blog;
  @OneToMany(mappedBy = "article")
  private java.util.List<BlogArticleTag> listOfBlogArticleTag;
}