package javap.react;
import rx.Observable;
import rx.functions.Action1;
import java.util.ArrayList;
import java.util.List;

public class RxJava {

    private List<Integer> list1;
    private List<Integer> list2;
    private List<Integer> list3;

    public RxJava(){
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
    }

    private void fillLists(){
        for (int i = 0; i < 10; i++) {
            list2.add(i);list2.add(i);list3.add(i);
        }

    }

    private void look1(){
        Observable<Integer>  obs1 = Observable.from(list1);
        Observable<Integer>  obs2 = Observable.from(list2);
        obs1.filter(n -> n>5).subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer x) {
                System.out.println(x);
            }
        });

        obs2.filter(n -> n>1).subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer x) {
                System.out.println(x);
            }
        });
        //Observable.merge(obs1,obs2);

       // obs2.filter(n -> n>1).subscribe();
        /*
        Observable.merge(obs1, obs2).subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer numero) {
                if (numero%2==0) {
                    System.out.println(numero);
                }
            }
        });
        */
    }


    private void look2(){
        Observable<Integer>  obs1 = Observable.from(list1);
        Observable<Integer>  obs2 = Observable.from(list2);
        Observable.merge(obs1, obs2).subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer numero) {
                if (numero%2==0) {
                    System.out.println(numero);
                }
            }
        });
    }

    private void look3(){
        Observable<Integer>  obs1 = Observable.from(list1);
        Observable<Integer>  obs2 = Observable.from(list2);
        Observable.merge(obs1, obs2)
                .filter(x -> x>4)
                .subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer numero) {
                if (numero%2==0) {
                    System.out.println(numero);
                }
            }
        });
    }

    private void look4(){
        Observable<Integer> obs1 = Observable.from(list1);
        Observable<Integer> obs2 = Observable.from(list2);
        Observable.merge(obs1,obs2).filter(x-> x%2==1).subscribe(System.out::println);
    }


    private void look5(){
        Observable<Integer> obs1 = Observable.from(list1);
        Observable<Integer> obs2 = Observable.from(list2);
        //obs1.filter(x-> x%2==0).subscribe(System.out::println);
        //obs2.filter(x-> x%2==1).subscribe(System.out::println);
        Observable.merge(obs1,obs2).subscribe(System.out::println);

    }

    private void look6(){

    }



    public static void main(String[] args){
      List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        Observable<String> obs = Observable.from(list);
        obs.subscribe(new Action1<String>(){
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        });

        //System.out.println("======>");
        RxJava rxJava = new RxJava();
        rxJava.fillLists();
        //rxJava.look6();
    }


}
