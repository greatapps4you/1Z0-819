package us.greatapps4you.ocp.mostmissed.interfaces;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import java.lang.annotation.Target;

@Retention(value = RUNTIME)
@Target(value = { PARAMETER, TYPE_USE })
public @interface NonNull {

}