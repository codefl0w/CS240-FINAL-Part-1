import java.util.EmptyStackException;

/**
 * Food Inventory
 */
public class Inventory {
	// Food items
	private Food bun;
	private Food cheese;
	private Food patty;
	private Food lettuce;
	private Food tomato;
	private Food onion;
	
	// Menu items
	private ArrayList burger; // 1
	private ArrayList cheeseBurger; // 2
	private ArrayList veganLettuceWrapBurger; // 3
	private ArrayList burgerNoOnion; // 4
	private ArrayList cheeseBurgerNoOnion; // 5
	private ArrayList burgerNoTomato; // 6
	
	// Food inventory
	private ArrayStack bunInventory;
	private ArrayStack cheeseInventory;
	private ArrayStack pattyInventory;
	private ArrayStack lettuceInventory;
	private ArrayStack tomatoInventory;
	private ArrayStack onionInventory;
	
	// items sold
	private int countItemOne;
	private int countItemTwo;
	private int countItemThree;
	private int countItemFour;
	private int countItemFive;
	private int countItemSix;
	
	// sales
	public int getCountItemOne() {
		return countItemOne;
	}
	
	public int getCountItemTwo() {
		return countItemTwo;
	}
	
	public int getCountItemThree() {
		return countItemThree;
	}
	
	public int getCountItemFour() {
		return countItemFour;
	}
	
	public int getCountItemFive() {
		return countItemFive;
	}
	
	public int getCountItemSix() {
		return countItemSix;
	}
	
	// items wasted
	private int wasteCheese;
	private int wasteBun;
	private int wastePatty;
	private int wasteLettuce;
	private int wasteTomato;
	private int wasteOnion;
	
	// wasted
	public int getWasteCheese() {
		return wasteCheese;
	}
	
	public int getWasteBun() {
		return wasteBun;
	}
	
	public int getWastePatty() {
		return wastePatty;
	}
	
	public int getWasteLettuce() {
		return wasteLettuce;
	}
	
	public int getWasteTomato() {
		return wasteTomato;
	}
	
	public int getWasteOnion() {
		return wasteOnion;
	}
	
	// setup
	Inventory() {
		setupFoods();
		setupMenu();
		setupInventory();
		resetCounters();
		resetWaste();
	}
	
	/**
	 * Add new items to inventory
	 */
	public void addItem(int item) {
		switch (item) {
			case 1:
				bunInventory.push(bun);
				break;
			case 2:
				cheeseInventory.push(cheese);
				break;
			case 3:
				pattyInventory.push(patty);
				break;
			case 4:
				lettuceInventory.push(lettuce);
				break;
			case 5:
				tomatoInventory.push(tomato);
				break;
			case 6:
				onionInventory.push(onion);
				break;
		}
		
	}
	
	/**
	 * Sort Food stacks
	 */
	public void sort() {
//		bunInventory.
//		int[] array = new int[5000];
//		while (bunInventory.peek() != null) {
//
//		}
//		shellSort.iterativeShellSort();
	}
	
	/**
	 * Order Menu Item
	 */
	public boolean order(int orderNum) {
		switch (orderNum) {
			case 1:
				try {
					bunInventory.peek();
					pattyInventory.peek();
					lettuceInventory.peek();
					tomatoInventory.peek();
					onionInventory.peek();
				} catch (EmptyStackException e) {
					return false;
				}
				
				System.out.println("BRUH");
				countItemOne++;
				bunInventory.pop();
				pattyInventory.pop();
				lettuceInventory.pop();
				tomatoInventory.pop();
				onionInventory.pop();
				return true;
			case 2:
				try {
					cheeseInventory.peek();
					bunInventory.peek();
					pattyInventory.peek();
					lettuceInventory.peek();
					tomatoInventory.peek();
					onionInventory.peek();
				} catch (EmptyStackException e) {
					return false;
				}
				
				countItemTwo++;
				cheeseInventory.pop();
				bunInventory.pop();
				pattyInventory.pop();
				lettuceInventory.pop();
				tomatoInventory.pop();
				onionInventory.pop();
				return true;
			case 3:
				try {
					lettuceInventory.peek();
					lettuceInventory.peek();
					tomatoInventory.peek();
					onionInventory.peek();
				} catch (EmptyStackException e) {
					return false;
				}
				
				countItemThree++;
				lettuceInventory.pop();
				lettuceInventory.pop();
				tomatoInventory.pop();
				onionInventory.pop();
				return true;
			case 4:
				try {
					bunInventory.peek();
					pattyInventory.peek();
					lettuceInventory.peek();
					tomatoInventory.peek();
				} catch (EmptyStackException e) {
					return false;
				}
				
				countItemFour++;
				bunInventory.pop();
				pattyInventory.pop();
				lettuceInventory.pop();
				tomatoInventory.pop();
				return true;
			case 5:
				try {
					cheeseInventory.peek();
					bunInventory.peek();
					pattyInventory.peek();
					lettuceInventory.peek();
					tomatoInventory.peek();
				} catch (EmptyStackException e) {
					return false;
				}
				
				countItemFive++;
				cheeseInventory.pop();
				bunInventory.pop();
				pattyInventory.pop();
				lettuceInventory.pop();
				tomatoInventory.pop();
				return true;
			case 6:
				try {
					bunInventory.peek();
					pattyInventory.peek();
					lettuceInventory.peek();
					onionInventory.peek();
				} catch (EmptyStackException e) {
					return false;
				}
				
				countItemSix++;
				bunInventory.pop();
				pattyInventory.pop();
				lettuceInventory.pop();
				onionInventory.pop();
				return true;
				default:
					return false;
		} // switch
		
	}
	
	/**
	 * Setup Foods
	 */
	private void setupFoods() {
		bun = new Food();
		bun.setExpirationDate(5);
		
		cheese = new Food();
		cheese.setExpirationDate(2);
		
		patty = new Food();
		patty.setExpirationDate(4);
		
		lettuce = new Food();
		lettuce.setExpirationDate(3);
		
		tomato = new Food();
		tomato.setExpirationDate(3);
		
		onion = new Food();
		onion.setExpirationDate(5);
	}
	
	/**
	 * Setup Menu
	 */
	private void setupMenu() {
		// burger
		burger = new ArrayList(); // 1
		burger.add(bun);
		burger.add(patty);
		burger.add(lettuce);
		burger.add(tomato);
		burger.add(onion);
		
		// cheese burger
		cheeseBurger = new ArrayList(); // 2
		cheeseBurger.add(cheese);
		cheeseBurger.add(bun);
		cheeseBurger.add(patty);
		cheeseBurger.add(lettuce);
		cheeseBurger.add(tomato);
		cheeseBurger.add(onion);
		
		// vegan lettuce wrap burger
		veganLettuceWrapBurger = new ArrayList(); // 3
		veganLettuceWrapBurger.add(lettuce);
		veganLettuceWrapBurger.add(lettuce);
		veganLettuceWrapBurger.add(tomato);
		veganLettuceWrapBurger.add(onion);
		
		// burger no onion
		burgerNoOnion = new ArrayList(); // 4
		burgerNoOnion.add(bun);
		burgerNoOnion.add(patty);
		burgerNoOnion.add(lettuce);
		burgerNoOnion.add(tomato);
		
		// cheese burger no onion
		cheeseBurgerNoOnion = new ArrayList(); // 5
		cheeseBurgerNoOnion.add(cheese);
		cheeseBurgerNoOnion.add(bun);
		cheeseBurgerNoOnion.add(patty);
		cheeseBurgerNoOnion.add(lettuce);
		cheeseBurgerNoOnion.add(tomato);
		
		// burger no tomato
		burgerNoTomato = new ArrayList(); // 6
		burgerNoTomato.add(bun);
		burgerNoTomato.add(patty);
		burgerNoTomato.add(lettuce);
		burgerNoTomato.add(onion);
	}
	
	/**
	 * Setup Empty Inventories
	 */
	private void setupInventory() {
		bunInventory = new ArrayStack();
		cheeseInventory = new ArrayStack();
		pattyInventory = new ArrayStack();
		lettuceInventory = new ArrayStack();
		tomatoInventory = new ArrayStack();
		onionInventory = new ArrayStack();
	}
	
	/**
	 * Counters for number of sales
	 */
	public void resetCounters() {
		countItemOne = 0;
		countItemTwo = 0;
		countItemThree = 0;
		countItemFour = 0;
		countItemFive = 0;
		countItemSix = 0;
	}
	
	/**
	 * Counters for number of sales
	 */
	public void resetWaste() {
		wasteCheese = 0;
		wasteBun = 0;
		wastePatty = 0;
		wasteLettuce = 0;
		wasteTomato = 0;
		wasteOnion = 0;
	}
	
}
