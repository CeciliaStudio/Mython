import org.ceciliastudio.mython.script.ScriptExecutor;

public class ScriptExecutorTest {
    public static void main(String[] args) {
        System.out.println(new ScriptExecutor("""
from java.lang import System
System.exit(1)""").execute());
    }
}
