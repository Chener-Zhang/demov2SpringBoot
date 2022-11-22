package com.example.demo.Business.Model.posts;

import com.example.demo.Business.Model.user.User;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "comments")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank
    @Column(name = "name")
    @Size(min=4, max = 40)
    private String name;
    @NotBlank
    @Column(name = "email")
    @Size(min=4, max = 50)
    @Email
    private String email;
    @NotBlank
    @Column(name = "body")
    @Size(min=10, message = "comment text must be minmum 10 chars")
    private String body;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
