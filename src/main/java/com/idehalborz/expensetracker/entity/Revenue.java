package com.idehalborz.expensetracker.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@Data
@NoArgsConstructor
@Entity
public class Revenue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDateTime date;
    private byte earnType;
    @ManyToOne
    @JoinColumn(name="accountId")
    private Account account;
    @ManyToOne
    @JoinColumn(name="revenueSourceId")
    private RevenueSource revenueSource;
}
