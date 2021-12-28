package dev.rockie.optional;

public class OptionalTest {

    @Test
    public void givenOptional_whenIfPresentWorks_thenCorrect() {
        Optional<String> opt = Optional.of("doggy-test");
        opt.ifPresent(name -> System.out.println(name.length));
    }
}