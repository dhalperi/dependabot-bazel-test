import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;

public class Example {
  public static String getMessage() {
    ImmutableList<String> words = ImmutableList.of("Hello", "Dependabot");
    return StringUtils.join(words, " ");
  }
}
