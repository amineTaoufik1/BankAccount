package com.example.bankaccountservice.service;

import com.example.bankaccountservice.DTO.BankAccountResponseDTO;
import com.example.bankaccountservice.DTO.BankAccountRequestDTO;

public interface AccountService {
    public BankAccountResponseDTO addAcount(BankAccountRequestDTO bankAccountDTO);
}
