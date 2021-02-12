import java.util.ArrayList;

public class apples {
	public static void main(String[] args) {
    int [] apples = {29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65};

        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> medium = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>();

        for (int i = 0; i < apples.length; i++) {
            Integer apple = apples[i];
        if (apple <= 50) {
            small.add(apple);
        } else if (apple >= 71) {
            big.add(apple);
        } else {
            medium.add(apple);
        }
    }
    System.out.println(small);
    System.out.println(big);
    System.out.println(medium);

    }
}

    

