package com.hiray.plugin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//import com.hiray.plugin.model.GirlFriend;
//import com.hiray.plugin.model.Man;
//import com.hiray.plugin.model.ManMapper;
//import com.hiray.plugin.model.Son;
//import com.hiray.plugin.model.Wife;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        Man man = new Man();
//        man.setAge(40);
//        Wife wife = new Wife();
//        wife.setAge(35);
//        wife.setName("Rose");
//        man.setWife(wife);
//        List<Son> sons = new ArrayList<>();
//        for (int i = 0; i < 2; i++) {
//            Son son = new Son();
//            son.setAge(17+i);
//            son.setName("Son"+i);
//            son.setGirlFriend(Arrays.asList(new GirlFriend(16,true),new GirlFriend(15,true)));
//            sons.add(son);
//        }
//        man.setSon(sons);
//
//        Man copyMan = new ManMapper().map(man);
//        System.out.println(copyMan);
    }
}
