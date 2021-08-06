package task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NotFoundPeopleException {

        List<People> peopleList = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

        System.out.println("военнообязанные мужчины: " + People.filterMaleSoldiers(peopleList));
        System.out.println("средний возраст мужчин: " + People.averageAgeMen(peopleList));
        System.out.println("количество работоспобоных людей: " + People.countWorkingPeople(peopleList));
    }
}
