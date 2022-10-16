import com.company.Animal;
import com.company.Eagle;
import com.company.Shark;
import com.company.Turtle;
public class Main {
    public static void main(String[] args) {
        Animal[] animals1 = {new Shark(), new Turtle(), new Eagle()};
        for (Animal animals : animals1
        ) {
            if (animals.getClass().getName().equals("com.company.Shark")) {
                ((Shark) animals).attack();
            } else if (animals instanceof Turtle) {
                ((Turtle) animals).swim();
            } else {
                ((Eagle) animals).fly();
            }

        }
        Shark[] sharks = new Shark[1];
        Eagle[] eagles = new Eagle[1];
        Turtle[] turtles = new Turtle[1];
        for (Animal animals2:animals1
             ) { if (animals2.getClass().getName().equals("com.company.Shark")){
                 sharks[0] = (Shark)animals2;
        } else if (animals2 instanceof Eagle) {
                 eagles[0] = (Eagle) animals2;
        }else turtles[0] = (Turtle) animals2;
        }
        for (Shark s:sharks
             ) { s.attack();

        }
    }
}
