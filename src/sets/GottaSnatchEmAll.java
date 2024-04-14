package sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GottaSnatchEmAll {

	static Set<String> newCollection(List<String> cards) {
		return Set.copyOf(cards);
	}

	static boolean addCard(String card, Set<String> collection) {
		return collection.add(card);
	}

	static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
		if(myCollection.isEmpty() || theirCollection.isEmpty() || theirCollection.containsAll(myCollection))
			return false;
		return !myCollection.equals(theirCollection);
	}

	public static Set<String> commonCards(List<Set<String>> collections) {
		Set<String> commonCards = new HashSet<>();
		if (!collections.isEmpty()) {
			commonCards = new HashSet<>(collections.getFirst());
			for (Set<String> collection : collections.subList(1, collections.size())) {
				commonCards.retainAll(collection);
			}
		}
		return commonCards;
	}

	static Set<String> allCards(List<Set<String>> collections) {
		Set<String> allCards = new HashSet<>();
		for (Set<String> collection : collections) {
			allCards.addAll(collection);
		}
		return allCards;
	}
}
