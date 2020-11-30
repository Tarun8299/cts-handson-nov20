package javaAssignmentMorning_3;
import java.util.*;
public class ComparatorAssignment {
public static void main(String[] args) {

	List<Items> itemlist = new ArrayList<Items>();
	itemlist.add(new Items(11, "Mi A2", 17000,3));
	itemlist.add(new Items(22, "Oppo F7", 12000,4));
	itemlist.add(new Items(33, "Samsung galaxy A51",25500,5));
	for(Items item : itemlist) 
		{System.out.println(item);}
		
		Comparator<Items> sortById = new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return i1.getId() - i2.getId();
			}
		};	
	System.out.println("Sorting id by comparator in ascending order");
		Collections.sort(itemlist, sortById); 
		for(Items item : itemlist) 
			System.out.println(item);
	Comparator<Items> sortByRating = new Comparator<Items>() {
		public int compare(Items i1, Items i2) {
			return i1.getRating() - i2.getRating();
		}	
	};
	
	System.out.println("Sorting by rating.....asc");
	 Collections.sort(itemlist, sortByRating);
	 for (Items item :itemlist) {
		 System.out.println(item);
	 }
	
		Comparator<Items> sortByRatingd = new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				
				return i2.getRating() - i1.getRating();
			}	
		};
	
		
		System.out.println("Sorting by rating....... desc");
		 Collections.sort(itemlist, sortByRatingd);
		 for (Items item :itemlist) {
			 System.out.println(item);
		 }
		
	
	
	
	}
}

