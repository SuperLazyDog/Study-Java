package com.company;

import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.ValueFactory;
import org.msgpack.value.Value;
import org.msgpack.value.ValueFactory;
import org.msgpack.value.ImmutableStringValue;


public class JsonTest {
    void test1() {
        System.out.println("hello world");
        Hello.sayHello();
        String json = "{ a: 1, b: {c: 1}}";
        ImmutableStringValue v = ValueFactory.newString(json);
        String vJson = v.toJson();
        String vStr = v.toString();
        System.out.println("---v---");
        System.out.println(v);
        System.out.println("---v.toJson()---");
        System.out.println(vJson);
        System.out.println(vJson.length());
        System.out.println("---v.toString()---");
        System.out.println(vStr);
        System.out.println(vStr.length());
        System.out.println("---json---");
        System.out.println(json);
        System.out.println(json.length());

        System.out.println("---comparision---");
        System.out.println(vJson.equals(json));
        System.out.println(vStr.equals(json));
        System.out.println(v.equals(ValueFactory.newString(vStr)));
        System.out.println(v.equals(ValueFactory.newString(vJson)));
//        Value v = new Value();
    }
}
