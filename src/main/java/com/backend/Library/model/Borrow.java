package com.backend.Library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrow {
    //id, borrowerId, bookId, borrowDate, returnDate, dueDate
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


}
