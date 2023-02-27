package com.idehalborz.expensetracker.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String publicId;
    private String name;
    private short expenseTypeId;
    private byte purchaseBy;
    private LocalDateTime date;
    private BigDecimal amount;
    private LocalDateTime createDate;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
