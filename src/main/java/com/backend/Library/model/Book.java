package com.backend.Library.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Book title is mandatory")
    private String title;
    @NotBlank(message = "Book description is mandatory")
    @Size(min = 5, max = 500)
    private String description;
    @NotBlank(message = "Book image is mandatory")
    private String image;
    @NotNull
    private Integer bookCopiesQty;
    @NotNull
    private boolean isAvailable;

    @ManyToMany
    private Author author;

}
