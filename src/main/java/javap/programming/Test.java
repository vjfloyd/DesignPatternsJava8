package javap.programming;

public class Test {


    public static void main(String[] args){
        Page pageDraft = new PageDraft();
        pageDraft.setContent("content");
        pageDraft.setHtml("html");
        pageDraft.getPage();

        Page pageBackup = new PageBackup();
        pageBackup.setHtml("html");
        pageBackup.setContent("content");
        System.out.println(pageBackup.toString());
    }
}
