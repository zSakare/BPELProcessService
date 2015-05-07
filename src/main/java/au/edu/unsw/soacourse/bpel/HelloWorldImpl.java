
package au.edu.unsw.soacourse.bpel;

import javax.jws.WebService;

@WebService(endpointInterface = "au.edu.unsw.soacourse.bpel.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

