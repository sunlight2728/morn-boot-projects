package site.morn.bean;

/**
 * 实例配置
 *
 * @author timely-rain
 * @since 2.1.0, 2019/5/18
 */
public interface BeanConfigurer {

  /**
   * 添加自定义实例注解
   *
   * @param registry 实例注解注册表
   */
  default void addBeanAnnotations(BeanAnnotationRegistry registry) {
  }
}
