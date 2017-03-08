package stage3;

public class Desk {
	private int iter;
	public Card[] desk = new Card[36];

		// Перемішує колоду у випадковому порядку
	public void shuffle() {
		for (int i = 0; i < desk.length; i++) {
			Card temp = desk[i];
			int random = (int) (Math.random() * 36);
			desk[i] = desk[random];
			desk[random] = temp;
		}

	}

	/*
	 * * Впорядкування колоди за мастями та значеннями Порядок сотрування:
	 * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES для
	 * кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6 Наприклад
	 * HEARTS Ace HEARTS King HEARTS Queen HEARTS Jack HEARTS 10 HEARTS 9 HEARTS
	 * 8 HEARTS 7 HEARTS 6 І так далі для DIAMONDS, CLUBS, SPADES
	 */
	public void order() {
		iter=0;
		for (int i = 0; i < Suit.values.length; i++) {
			for (int j = 0; j < Rank.values.length; j++) {
				desk[iter] = (new Card(Rank.values[j], Suit.values[i]));
				iter++;
			}
		}

	}

	// Повертає true у випадку коли в колоді ще доступні карти
	public boolean hasNext() {
		if (iter > 0)
			return true;
		else
			return false;
	}

	// "Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
	// Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть
	// SPADES 6 потім
	// SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
	public Card drawOne() {
		if (iter > 0) {
			iter--;
			return desk[iter];
		} else {
			return null;
		}
	}
}
