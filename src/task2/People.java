package task2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class People {
    private final String name;
    private final int age;
    private final Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public static List<People> filterMaleSoldiers(List<People> list) {
        return list.stream().filter(i -> i.sex == Sex.MAN && i.age >= 18 && i.age <= 27)
                .collect(Collectors.toList());
    }

    public static double averageAgeMen(List<People> list) throws NotFoundPeopleException {

        return Optional.of(list.stream().filter(i -> i.sex == Sex.MAN)
                .mapToInt(i -> i.age).average()
                .orElseThrow(() -> new NotFoundPeopleException("Мужчин в переданной коллекции не обнаружено."))).get();
    }

    public static long countWorkingPeople(List<People> list) {
        return list.stream().filter(i -> (i.age > 18)
                && ((i.sex == Sex.MAN && i.age < 60) || (i.sex == Sex.WOMEN && i.age < 55)))
                .count();
    }
}
