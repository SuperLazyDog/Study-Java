// import org.msgpack.value.ValueFactory;
import java.time.*;
class Json {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        String str = now.toString();
        System.out.println(str);
        System.out.println(Instant.parse(str));
    }
}
