package org.stjs.hello;

import static org.stjs.javascript.Global.alert;
import static org.stjs.javascript.Global.window;

import org.stjs.javascript.dom.DOMEvent;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.dom.Form;
import org.stjs.javascript.dom.Input;
import org.stjs.javascript.functions.Callback1;

public class HelloWorld {
    public static void main(String[] args){
        window.onload = new Callback1<DOMEvent>() {
            public void $invoke(DOMEvent ev) {
                Form form = window.document.forms.$get(0);
                Element button = form.elements.$get("say");
                final Input text = form.elements.$get("to");
                button.onclick = (e) -> {
                    alert("Hello " + text.value);
                    return true;
                };
            }
        };
    }
}
