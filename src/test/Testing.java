package test;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.junit.Assert.*;

public class Testing {
    @Test
    public void whenCreatesEmptyOptional_thenCorrect() {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);


        a.remove(1);
        a.removeIf(item -> item ==1);
        a.forEach(item -> System.out.println(item));

        System.out.println(a.equals(List.of(1, 2, 3)));
        Optional<String> empty = Optional.empty();
        Assert.assertFalse(empty.isPresent());

    }

    @Test
    public void giveNonNull_whenCreatesNonNullable_thenCorrect() {
        String name = "baeldung";
        Optional<String> opt = Optional.of(name);
        Assert.assertTrue(opt.isPresent());
    }

    @Test(expected = NullPointerException.class)
    public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
        String name = null;
        Optional.of(name);
    }

    @Test
    public void givenNonNull_whenCreatesNullable_thenCorrect() {
        String name = "baeldung";
        Optional<String> opt = Optional.ofNullable(name);
        Assert.assertTrue(opt.isPresent());
    }

    @Test
    public void givenNull_whenCreatesNNullable_thenCorrect() {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        Assert.assertFalse(opt.isPresent());
    }

    @Test
    public void givenOptional_whenIsPresentWorks_thenCorrect() {
        Optional<String> opt = Optional.of("Baeldung");
        Assert.assertTrue(opt.isPresent());

        opt = Optional.ofNullable(null);
        Assert.assertFalse(opt.isPresent());
    }

    @Test
    public void givenAnEmptyOptional_thenIsEmptyBehavesAsExpected() {
        Optional<String> opt = Optional.of("Baeldung");
        Assert.assertFalse(opt.isEmpty());

        opt = Optional.ofNullable(null);
        Assert.assertTrue(opt.isEmpty());
    }
    @Test
    public void givenOptional_whenIfPresentWorkds_thenCorrect() {
        Optional<String> opt = Optional.of("baeldung");
        Optional<String> opt1 = Optional.ofNullable(null);
        Assert.assertEquals("baeldung", opt.orElse("tipsy"));
        Assert.assertEquals("tipsy", opt1.orElse("tipsy"));
        opt.ifPresent(name -> System.out.println(name.length()));
    }

    @Test
    public void whenOrElseWorkds_thenCorrect() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("john");
        Assert.assertEquals("john", name);
    }

    @Test
    public void whenOrElseGetWorks_thenCorrect() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
        Assert.assertEquals("john", name);
    }

    public String getMyDefault() {
        System.out.println("Getting default Value");
        return "Default Value";
    }

    @Test
    public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
        String text = null;
        String defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
        Assert.assertEquals("Default Value", defaultText);

        defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        Assert.assertEquals("Default Value", defaultText);
    }

    @Test
    public void whenOrElseGetAndOrElseDiffer_thenCorrect() {
        String text = "Text present";
        System.out.println("Using orElseGet:");

        String defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
        Assert.assertEquals("Text present", defaultText);

        System.out.println("Using orElse:");
        defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        Assert.assertEquals("Text present", defaultText);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenOrElseThrowWorks_thenCorrect() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
    }

    @Test
    public void givenOptional_whenGetsValue_thenCorrect() {
        Optional<String> opt = Optional.ofNullable("baeldung");
        String name = opt.get();
        Assert.assertEquals("baeldung", name);
    }

    @Test(expected = NoSuchElementException.class)
    public void givenOptionalWithNull_whenGetThrowsException_thenCorrect() {
        Optional<String> opt = Optional.ofNullable(null);
        String name = opt.get();
    }

    @Test
    public void whenOptionalFilterWorks_thenCorrect() {
        Integer year = 2016;
        Optional<Integer> yearOptional = Optional.of(year);
        boolean is2016 =  yearOptional.filter(y -> y == 2016).isPresent();
        Assert.assertTrue(is2016);
        boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
        Assert.assertFalse(is2017);
    }

    public class Modem {
        private Double price;

        public Modem(Double price) {
            this.price = price;
        }

        public Double getPrice() {
            return this.price;
        }
    }

    public boolean priceIsIInRange1(Modem modem) {
        boolean isInRange = false;
        if (modem != null && modem.getPrice() != null && (modem.getPrice() >= 10 && modem.getPrice() <= 15)) {
            isInRange = true;
        }
        return isInRange;
    }

    @Test
    public void whenFiltersWithoutOptional_thenCorrect() {
        Assert.assertTrue(priceIsIInRange1(new Modem(10.0)));
        Assert.assertFalse(priceIsIInRange1((new Modem(9.9))));
        Assert.assertFalse(priceIsIInRange1(new Modem(null)));
        Assert.assertFalse(priceIsIInRange1(new Modem(15.5)));
        Assert.assertFalse(priceIsIInRange1(null));
    }

    public boolean priceIsIInRange2(Modem modem2) {
        return Optional.ofNullable(modem2)
                .map(Modem::getPrice)
                .filter(p -> p >= 10)
                .filter(p -> p <=15)
                .isPresent();
    }

    @Test
    public void givenOptional_whenMapWorks_thenCorrect() {
        List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");

        Optional<List<String>> listOptional = Optional.of(companyNames);

        int size = listOptional.map(List::size)
                .orElse(0);


        Assert.assertEquals(6, size);
    }

    @Test
    public void givenOptional_whenMapWorks_thenCorrect2() {
        String name = "baeldung";
        Optional<String> nameOptional = Optional.of(name);

        int len = nameOptional.map(String::length).orElse(0);

        Assert.assertEquals(8, len);
    }

    @Test
    public void givenOptional_whenMapWorksWithFilter_thenCorrect() {
        String password = "password ";
        Optional<String> passOpt = Optional.of(password);

        boolean correctPassword = passOpt.filter( pass -> pass.equals("password")).isPresent();
        Assert.assertFalse(correctPassword);

        correctPassword = passOpt.map(String::trim).filter(pass -> pass.equals("password")).isPresent();

        Assert.assertTrue(correctPassword);

    }
    public class Person {
        private String name;
        private int age;
        private String password;


        public Person(String name , int age) {

        }
        public Optional<String> getName() {
            return Optional.ofNullable(name);
        }

        public Optional<Integer> getAge() {
            return Optional.ofNullable(age);
        }

        public Optional<String> getPassword() {
            return Optional.ofNullable(password);
        }
    }

    @Test
    public void givenOptional_whenFlatMapWorks_thenCorrect2() {
        Person person = new Person("john", 26);
        Optional<Person> personOptional = Optional.of(person);

        Optional<Optional<String>> nameOptionalWrapper = personOptional.map(Person::getName);

        Optional<String> nameOptional = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);

        String name1 = nameOptional.orElse("");
        Assert.assertEquals("john", name1);

        String name = personOptional.flatMap(Person::getName).orElse("");
    }


}
