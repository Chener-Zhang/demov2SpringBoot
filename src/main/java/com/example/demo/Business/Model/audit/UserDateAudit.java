package com.example.demo.Business.Model.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createdAt","updatedAt","createdBy","updatedBy"},
        allowGetters = true
)
public class UserDateAudit implements Serializable {

    @CreatedDate
    @Column(updatable = false)
    private Long createAt;
    @LastModifiedDate
    private Long updateAt;
    @CreatedBy
    @Column(updatable = false)
    private String createBy;
    @LastModifiedBy
    private String updateBy;
}
