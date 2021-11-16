package com.example.email_rv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView; import androidx.recyclerview.widget.LinearLayoutManager; import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    static final String[] names = {"Sam","Facebook","Google+","Twitter","Pinterest Weekly","Josh"};
    static final String[] subjects = {"Weekend Adventure","James, you have 1 new notification",
                                        "Top suggested Google+ pages for you","Follow T-Mobile, Samsung mobile",
                                        "Pins you'll love!","Going Lunch"};
    static final String[] descs = {"Lets go fishing with John and the others","A lot has happened on Facebook since",
                                    "Top suggested Google+ pages for you","James, some people you may know",
                                    "Have you seen these Pins yet? Pinterest","Lets meet up at the cafe 4 lunch"};
    static final String[] times = {"10:42am", "20:04pm", "18:44pm", "16:04pm", "9:04am", "1:04am"};
    static final int[] avatar = {R.drawable.s, R.drawable.f,R.drawable.g, R.drawable.t, R.drawable.p, R.drawable.j};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter myAdapter= new MyAdapter(this);
        rv.setAdapter(myAdapter);
    }
    static class MyAdapter extends RecyclerView.Adapter<MyAdapter.Myholder> {
        Context c;
        public MyAdapter(Context context) {
            c = context; }
        @NonNull
        @Override
        public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(c);
            View v = layoutInflater.inflate(R.layout.listitem, parent, false);
            return new Myholder(v);
        }
        @Override
        public void onBindViewHolder(@NonNull MyAdapter.Myholder holder, int
                position) { holder.name.setText(names[position]);
                holder.subject.setText(subjects[position]); holder.desc.setText(descs[position]);
                holder.time.setText(times[position]); holder.img.setImageResource(avatar[position]);
        }
        @Override
        public int getItemCount() { return names.length;
        }
        public class Myholder extends RecyclerView.ViewHolder {
            TextView name, subject, desc, time;
            ImageView img;
            public Myholder(@NonNull View itemView) {
                super(itemView); img=itemView.findViewById(R.id.img);
                name=itemView.findViewById(R.id.tv);
                subject=itemView.findViewById(R.id.tv2);
                desc=itemView.findViewById(R.id.tv3);
                time=itemView.findViewById(R.id.tv4);
            } }
    } }