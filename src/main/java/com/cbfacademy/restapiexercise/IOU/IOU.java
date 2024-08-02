package com.cbfacademy.restapiexercise.IOU;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ious")
public class IOU {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)  
    private UUID id;
    private String borrower;
    private String lender;
    private BigDecimal amount;
    private Instant dateTime;

public IOU() {
    this(null, null, BigDecimal.ZERO, Instant.now());
}

public IOU(UUID id, String borrower, String lender, BigDecimal amount, Instant dateTime) {
    this.id = id;
    this.borrower = borrower;
    this.lender = lender;
    this.amount = amount;
    this.dateTime = dateTime;
}

public UUID getId() {
    return id;
}

public void setBorrower(String borrower) {
    this.borrower = borrower;
}

public String getBorrower() {
    return borrower;
}

public void setLender(String lender) {
    this.lender = lender;
}

public String getLender() {
    return lender;
}

public void setAmount(BigDecimal amount) {
    this.amount = amount;
}

public BigDecimal getAmount() {
    return amount;
}

public void setdateTime(Instant dateTime) {
    this.dateTime = dateTime;
}

public Instant getDateTime() {
    return dateTime;
}

}
