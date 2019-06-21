package javap.programming;

import lombok.Data;

@Data
public abstract class Page {
    private String id;
    private String content;
    private String html;
    public abstract void getPage();

    private void publish() {
        System.out.println("publish");
    }

    private void cancel(){
        System.out.println("publish");
    }
}
