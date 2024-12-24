package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(name = "Loans", description = "Schema to hold loan information")
@Data
public class LoansDto {

    @NotNull(message = "Mobile Number can not be null or empty")
    @Pattern(regexp = "^$|[0,9]{10}", message = "Mobile Number must be 10 digits")
    @Schema(description = "Mobile Number of Customer", example = "4365327698")
    private String mobileNumber;

    @NotNull(message = "Loan Number can not be null or empty")
    @Pattern(regexp = "^$|[0,9]{12}", message = "Loan Number must be 12 digits")
    @Schema(description = "Loan Number of the Customer", example = "548732457654")
    private String loanNumber;

    @NotNull(message = "Loan Type can not be null or empty")
    @Schema(description = "Loan Type of the Customer", example = "Home Loan")
    private String loanType;

    @Positive(message = "Total Loan should be greater than zero")
    @Schema(description = "Total Loan of the Customer", example = "100000")
    private int totalLoan;

    @PositiveOrZero(message = "Total loan amount paid should be equal or greater than zero")
    @Schema(description = "Total loan amount paid", example = "1000")
    private int amountPaid;

    @PositiveOrZero(message = "Total outstanding amount should be equal or greater than zero")
    @Schema(description = "Total outstanding amount against a loan", example = "99000")
    private int outstandingAmount;
}
