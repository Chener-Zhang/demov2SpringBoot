package com.example.demo.Business.Model.posts;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@Table(name = "tags")
public class Tag implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="post_tag", joinColumns = @JoinColumn(name = "tag_id", referencedColumnName ="id"), inverseJoinColumns = @JoinColumn(name = "post_id", referencedColumnName = "id") )
    private List<Post> posts;
}
