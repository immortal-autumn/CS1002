public class price{
	double birthdayCake = 24.75;
	double plateOfSandwiches = 13.50;
	double plateOfSausageRolls = 13.50;
	double plateOfJellyAndIcecream = 12.75;
	double magican = 69.99;
	double passtheparcelGame = 18.10;
	double heliumBallon = 1.02;
	double partyBag = 2.55;
	double invitation = 1.33;
	double partyVenue = 98.99;
	double foodCost = birthdayCake +  4 * plateOfSandwiches + 4 * plateOfSausageRolls + 4 * plateOfJellyAndIcecream;
	double personCost = magican;
	double gameCost = 2 * passtheparcelGame + 16 * heliumBallon;
	double otherCost = 15 * partyBag + 15 * invitation;
	double placeCost = partyVenue;
	double totalCost = foodCost + personCost + gameCost + otherCost + placeCost;
		double getTotalCost(){
		return totalCost;
		}
}