package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    //vars
    private ArrayList<String> mNames =new ArrayList <> (  );
    private ArrayList<String> mImageUrls =new ArrayList <> (  );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Log.d(TAG,"onCreate started");

        initImageBitmaps ();





    }

    private  void initImageBitmaps() {
        Log.d ( "" , "initBitmaps preparing bitmaps" );

        mImageUrls.add ( "https://picsum.photos/200" );
        mImageUrls.add ( "https://picsum.photos/200" );
        mImageUrls.add ( "https://picsum.photos/200" );
        mImageUrls.add ( "https://picsum.photos/200" );
        mImageUrls.add ( "https://picsum.photos/200" );
        mImageUrls.add ( "https://picsum.photos/200" );
        mImageUrls.add ( "https://picsum.photos/200" );
        mImageUrls.add ( "https://picsum.photos/200" );
        mImageUrls.add ( "https://picsum.photos/200" );
        mImageUrls.add ( "https://picsum.photos/200" );
        mImageUrls.add ( "https://picsum.photos/200" );
        mImageUrls.add ( "https://picsum.photos/200" );

        mNames.add ( "Random1" );
        mNames.add ( "Random2" );
        mNames.add ( "Random3" );
        mNames.add ( "Random4" );
        mNames.add ( "Random5" );
        mNames.add ( "Random6" );
        mNames.add ( "Random7" );
        mNames.add ( "Random8" );
        mNames.add ( "Random9" );
        mNames.add ( "Random10" );
        mNames.add ( "Random11" );
        mNames.add ( "Random12" );

        initRecyclerView ();


    }

    private  void initRecyclerView(){
        Log.d(TAG,"initRecyclerView : init recyclerView");
        RecyclerView recyclerView = findViewById ( R.id.recycler_view );
        RecyclerViewAdapter adapter = new RecyclerViewAdapter ( this,mNames,mImageUrls );
        recyclerView.setAdapter ( adapter );
        recyclerView.setLayoutManager ( new LinearLayoutManager(this,RecyclerView.VERTICAL,false) );

    }
}