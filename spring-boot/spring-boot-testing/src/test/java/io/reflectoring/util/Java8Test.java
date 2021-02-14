package io.reflectoring.util;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
class Java8Test {


  @Test
  void testOfNullable(){
    // given
// 메서드 시그니처
  //  public T orElse(T other);
// 예제
    String result = (String) Optional.ofNullable(null).orElse("default 나머지");
    System.out.println(result); // print 'default'
    assertThat(result).isEqualTo("default 나머지");

    String result2 = Optional.ofNullable("input").filter("test"::equals).orElseGet(() ->"defalut");
    assertThat(result2).isEqualTo("default");
    // then
   // assertThat(userId).isEqualTo(1L);

    // 메서드 시그니처
  //  public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X;
// 예제
    Optional.ofNullable("input").filter("test"::equals).orElseThrow(NoSuchElementException::new);

    // 메서드 시그니처
    //public void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction);
// 예제 java 9
    /*
    Optional.ofNullable("test")
            .ifPresentOrElse(value -> System.out.println(value), () -> System.out.println("null")); // print 'test'
    Optional.ofNullable(null)
            .ifPresentOrElse(value -> System.out.println(value), () -> System.out.println("null")); // print 'null'

     */
  }

}
