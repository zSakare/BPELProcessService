package au.edu.unsw.soacourse.bpel;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

