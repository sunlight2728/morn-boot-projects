package site.morn.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * site.morn.util
 *
 * @author timely-rain
 * @since 1.0.0, 2019/4/21
 */
@RunWith(JUnit4.class)
public class ArrayUtilsTest {

  private Integer[] intArray = {1, 2, 3};

  @Test
  public void isEmpty() {
    boolean isEmpty = ArrayUtils.isEmpty(intArray);
    Assert.assertFalse(isEmpty);
  }

  @Test
  public void merge() {
    Integer[] merge = ArrayUtils.merge(1, 2, 3);
    Assert.assertArrayEquals(intArray, merge);
  }

  @Test
  public void anySearch() {
    String[] first = {"1", "2"};
    String[] sec = {"2", "3"};
    String[] third = {"3", "4"};
    Assert.assertTrue(ArrayUtils.anySearch(first, sec));
    Assert.assertFalse(ArrayUtils.anySearch(first, third));
  }

  @Test
  public void first() {
    Object[] objects = {null, new Coffee(), new Banana(), new Apple()};
    Food first = ArrayUtils.first(objects, Food.class);
    Assert.assertNotNull(first);
    Assert.assertEquals(first.getClass().getSimpleName(), Banana.class.getSimpleName());
  }

  private interface Food {

  }

  private interface Water {

  }

  private class Apple implements Food {

  }

  private class Banana implements Food {

  }

  private class Coffee implements Water {

  }
}