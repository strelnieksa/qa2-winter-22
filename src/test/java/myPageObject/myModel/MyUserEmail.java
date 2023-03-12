package myPageObject.myModel;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyUserEmail {
    // String tld;
    @Test
    public String getTLD() {
        List<String> element = new ArrayList<>();
        element.add("lv");
        element.add("com");
        element.add("net");
        element.add("ru");
        element.add("ee");
        element.add("net.org");
        element.add("biz");
        element.add("io");

        Random random = new Random();
        String tld = element.get(random.nextInt(element.size()));
        //System.out.println(tld);
        return tld;
    }

    public String getDomain() {
        List<String> element = new ArrayList<>();
        element.add("google");
        element.add("yandex");
        element.add("yahoo");
        element.add("inbox");
        element.add("tvnet");
        element.add("hotmail");
        element.add("thunderbird");
        element.add("proton");
        element.add("zoho");
        element.add("Mailbox");
        element.add("HubSpot");
        element.add("Tutanota");
        element.add("Posteo");

        Random random = new Random();
        String domain = element.get(random.nextInt(element.size()));
        //System.out.println(domain);
        return domain;
    }

}

