package com.backend.Library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "the user id can't be empty")
    private User user;

    @NotEmpty(message = "the book id can't be empty")
    private Book book;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime borrowDate;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime returnDate;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime dueDate;

}
