import java.util.List;

public class Main {
    public static void main(String[] args) {

        AnimalHelper ah = new AnimalHelper();

//        Animal a = new Animal();
//        a.setId(3);
//        a.setAge(5);
//        a.setName("Pushok");
//        a.setTail(true);
//
//        ah.add(a);

//        Animal a = ah.getById(1);
////        System.out.println(a.getAge() + " " + a.getId() + " " + a.getName() + " " + a.isTail());
//
//        ah.remove(a);

        List<Animal> animals = ah.getAll();
        for (Animal a: animals) {
            System.out.println(a.getId() + " " + a.getName() + " " + a.getAge() + " " + a.isTail());
        }
    }
}
