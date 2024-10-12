package com.microservice.BookStoreService.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="mybookissue")
public class BookIssue{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer bookid;
    private String student_id;
    private Date Date;
    private Integer Time;
    }
