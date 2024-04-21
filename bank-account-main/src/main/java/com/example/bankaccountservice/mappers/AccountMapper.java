package com.example.bankaccountservice.mappers;

import com.example.bankaccountservice.DTO.BankAccountRequestDTO;
import com.example.bankaccountservice.DTO.BankAccountResponseDTO;
import com.example.bankaccountservice.entities.BankAccount;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    private ModelMapper modelMapper= new ModelMapper();
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        return modelMapper.map(bankAccount,BankAccountResponseDTO.class);
    }

    public BankAccount fromBankAccountRequestDTO(BankAccountRequestDTO bankAccountRequestDTO){
        return modelMapper.map(bankAccountRequestDTO,BankAccount.class);
    }


}
