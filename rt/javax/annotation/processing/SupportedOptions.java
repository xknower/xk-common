package javax.annotation.processing;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SupportedOptions {
  String[] value();
}


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\javax\annotation\processing\SupportedOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */