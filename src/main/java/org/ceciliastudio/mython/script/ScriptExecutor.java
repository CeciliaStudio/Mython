package org.ceciliastudio.mython.script;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class ScriptExecutor {
    private final Context context;
    private final String script;

    public ScriptExecutor(String script) {
        this.context = Context.newBuilder().allowAllAccess(true).build();
        this.script = script;
    }

    public Value execute() {
        return context.eval("python", this.script);
    }
}
