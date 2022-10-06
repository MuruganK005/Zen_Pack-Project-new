package com.ZenPack.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "zen_pack")
@Builder
public class ZenPack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "zen_pack_name")
    private String name;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    private Date createdDate=new Date();
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "updated_time")
    private Date updatedTime=new Date();



}