package com.smallworld;

public class Main {
    public static void main(String[] args) {
        TransactionDataFetcher dataFetcher = new TransactionDataFetcher();

        System.out.println("Total Transaction Amount: " + dataFetcher.getTotalTransactionAmount());
        System.out.println("Total Transaction Amount Sent By Aunt Pollys: " + dataFetcher.getTotalTransactionAmountSentBy("Aunt Pollys"));
        System.out.println("Max Transaction Amount: " + dataFetcher.getMaxTransactionAmount());
        System.out.println("count unique clients: " + dataFetcher.countUniqueClients());
        System.out.println("hasOpenComplianceIssues: " + dataFetcher.hasOpenComplianceIssues("Aunt Polly"));
        System.out.println(dataFetcher.getTransactionsByBeneficiaryName().size());
        System.out.println("UnsolvedIssueIds: "+dataFetcher.getUnsolvedIssueIds().size());
        System.out.println("SolvedIssueIds: "+dataFetcher.getAllSolvedIssueMessages().size());
        System.out.println(dataFetcher.getTop3TransactionsByAmount().get(0).getAmount());
        // Add calls to other methods here...

        System.out.println("Top Sender: " + dataFetcher.getTopSender().orElse("No top sender found."));
    }
}

