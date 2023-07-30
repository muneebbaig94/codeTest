package com.smallworld.test;

import com.smallworld.TransactionDataFetcher;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionDataFetcherTest {

    private static TransactionDataFetcher dataFetcher;

    @BeforeAll
    static void setUp() {
        dataFetcher = new TransactionDataFetcher();
    }

    @Test
    void testGetTotalTransactionAmount() {
        assertEquals(4439.17, dataFetcher.getTotalTransactionAmount(), 0.01);
    }

    @Test
    void testGetTotalTransactionAmountSentBy() {
        assertEquals(67.8, dataFetcher.getTotalTransactionAmountSentBy("Aunt Pollys"), 0.01);
       // assertEquals(566.77, dataFetcher.getTotalTransactionAmountSentBy("Billy Kimber"), 0.01);
    }

    @Test
    void testGetMaxTransactionAmount() {
        assertEquals(985.0, dataFetcher.getMaxTransactionAmount(), 0.01);
    }

    @Test
    void testCountUniqueClients() {
        assertEquals(15, dataFetcher.countUniqueClients());
    }

    @Test
    void testHasOpenComplianceIssues() {
       //assertTrue(dataFetcher.hasOpenComplianceIssues("Tom Shelby"));
        assertFalse(dataFetcher.hasOpenComplianceIssues("Aunt Polly"));
    }

    @Test
    void testGetTransactionsByBeneficiaryName() {
        assertEquals(10, dataFetcher.getTransactionsByBeneficiaryName().size());
    }

    @Test
    void testGetUnsolvedIssueIds() {
        assertEquals(5, dataFetcher.getUnsolvedIssueIds().size());
    }

    @Test
    void testGetAllSolvedIssueMessages() {
        assertEquals(3, dataFetcher.getAllSolvedIssueMessages().size());
    }

    @Test
    void testGetTop3TransactionsByAmount() {
        assertEquals(3, dataFetcher.getTop3TransactionsByAmount().size());
        assertEquals(985.0, dataFetcher.getTop3TransactionsByAmount().get(0).getAmount(), 0.01);
    }

    @Test
    void testGetTopSender() {
        assertEquals("Grace Burgess", dataFetcher.getTopSender().orElse(""));
    }
}
