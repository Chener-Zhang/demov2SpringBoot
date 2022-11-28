package com.example.demo.Business.Model.posts;


import com.example.demo.Business.Model.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@Table(name = "posts")
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank
    @Column(name = "title")
    @Size(min = 4, max = 40)
    private String title;
    @NotBlank
    @Column(name = "body")
    @Size(max = 100)
    private String body;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Comment> comments;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="post_tag", joinColumns = @JoinColumn(name = "post_id", referencedColumnName ="id"), inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id") )
    private List<Tag> tags;


}
