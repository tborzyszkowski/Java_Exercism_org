package sets;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class GottaSnatchEmAllTest {

	@Test
	void testCommonCardsAllCardsDifferent() {
		List<Set<String>> collections = List.of(Set.of("Veevee"), Set.of("Bleakachu"), Set.of("Wigglycream"));
		Set<String> expected = Set.of();
		assertThat(GottaSnatchEmAll.commonCards(collections), is(expected));
	}
}