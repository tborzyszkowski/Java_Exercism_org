package WizardsAndWarriors2;

public class GameMaster {

	public String describe(Character character){
		return String.format(
				"You're a level %d %s with %d hit points.",
				character.getLevel(),
				character.getCharacterClass(),
				character.getHitPoints()
		);
	}

	public String describe(Destination destination){
		return String.format(
				"You've arrived at %s, which has %d inhabitants.",
				destination.getName(),
				destination.getInhabitants()
		);
	}

	public String describe(TravelMethod travelMethod){
		if (TravelMethod.WALKING == travelMethod)
			return "You're traveling to your destination by walking.";
		if (TravelMethod.HORSEBACK == travelMethod)
			return "You're traveling to your destination on horseback.";
		return "";
	}

	public String describe(Character character, Destination destination, TravelMethod travelMethod){
		return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
	}

	public String describe(Character character, Destination destination){
		return describe(character, destination, TravelMethod.WALKING);
	}
}

