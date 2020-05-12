package java.lang;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SafeVarargs {}


/* Location:              D:\tools\env\Java\jdk1.8.0_211\rt.jar!\java\lang\SafeVarargs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */