package com.example.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    newAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv=findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(this));
         adapter= new newAdapter(dataque());
         rcv.setAdapter(adapter);}
   public ArrayList<Model1> dataque(){
        ArrayList<Model1> holder =new ArrayList<>();
        Model1 ob1=new Model1();
        ob1.setHeader("Programming");
        // ob1.setDesc("python");
        // ob1.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob1);

         Model1 ob2= new Model1();
          ob2.setHeader("pp");
         //  ob2.setDesc("python");
        //   ob2.setImgname(R.drawable.ic_launcher_background);
           holder.add(ob2);

        return holder;

}


}