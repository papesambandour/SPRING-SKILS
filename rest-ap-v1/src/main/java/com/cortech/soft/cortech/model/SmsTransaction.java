package com.cortech.soft.cortech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsTransaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String smsTo;
    private Integer statusCode;
    private String  responseApi;
    private String   provider ;
    private Date sendedAt ;
    private Date createdAt ;
    private Integer qteSms ;
    @Column( columnDefinition="int(1) default 0  ")
    private Integer state ;
    @Column( columnDefinition="int(1) default 0  ")
    private Integer statut ;
}
