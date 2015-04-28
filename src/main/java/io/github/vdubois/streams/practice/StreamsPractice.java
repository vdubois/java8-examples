package io.github.vdubois.streams.practice;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * Created by vdubois on 27/04/15.
 */
public class StreamsPractice {
    public static void main(String[] args) {
        Trader vince = new Trader("Vincent Dubois", "Cambridge");
        Trader robert = new Trader("Robert Trujillo", "Milan");
        Trader philip = new Trader("Philippe Etchebest", "Cambridge");
        Trader david = new Trader("David Hasselhof", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(vince, 2011, 300),
                new Transaction(robert, 2012, 1000),
                new Transaction(philip, 2011, 400),
                new Transaction(david, 2012, 710),
                new Transaction(robert, 2012, 700),
                new Transaction(philip, 2012, 950)
        );

        // Toutes les transactions de l'année 2011, ordonnées par valeur ascendante
        List<Transaction> allTransactionsWithin2011OrderedByValueAsc = transactions.stream()
                .filter(t -> 2011 == t.getYear())
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        System.out.println(allTransactionsWithin2011OrderedByValueAsc);
        
        // Villes uniques où travaillent les traders
        List<String> uniqueCities = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(toList());
        System.out.println(uniqueCities);
        
        // Tous les traders de Cambridge, par ordre alphabétique sur le nom
        List<Trader> tradersFromCambridgeOrderedByNameAsc = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .sorted(comparing(Trader::getName))
                .collect(toList());
        System.out.println(tradersFromCambridgeOrderedByNameAsc);
        
        // Liste de tous les noms des traders sous forme de String, ordonnés
        System.out.println(transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .map(Trader::getName)
                .sorted()
                .collect(joining(", ")));
        
        // Est ce qu'il y a des traders basés à Milan ?
        boolean areAnyTradersBasedInMilan = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> "Milan".equals(trader.getCity()));
        System.out.println(areAnyTradersBasedInMilan);
        
        // Afficher les valeurs des transactions des traders vivant à Cambridge
        List<Integer> values = transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue)
                .collect(toList());
        System.out.println(values);
    }
}
