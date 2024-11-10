package com.phyo.restapi.service;

import com.phyo.restapi.dto.ExpenseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service interface for Expense module
 * @author Bushan SC
 * */

public interface ExpenseService {

    /**
     * It will fetch the expenses from database
     * @return list
     * */
    List<ExpenseDTO> getAllExpenses();

    /**
     * It will fetch the single expense details from database
     * @param expenseId
     * @return ExpenseDTO
     * *//*
    ExpenseDTO getExpenseByExpenseId(String expenseId);

    *//**
     * It will delete the expense from database
     * @param expenseId
     * @return void
     * *//*
    void deleteExpenseByExpenseId(String expenseId);

    *//**
     * It will save the expense details to database
     * @param expenseDTO
     * @return ExpenseDTO
     * *//*
    ExpenseDTO saveExpenseDetails(ExpenseDTO expenseDTO);

    *//**
     * It will update the expense details to database
     * @param expenseDTO
     * @param expenseId
     * @return ExpenseDTO
     * *//*
    ExpenseDTO updateExpenseDetails(ExpenseDTO expenseDTO, String expenseId);*/
}