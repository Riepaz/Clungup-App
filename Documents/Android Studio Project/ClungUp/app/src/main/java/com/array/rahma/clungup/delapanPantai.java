package com.array.rahma.clungup;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

/**
 * Created by RIFAZ on 17/05/2016.
 */
public class delapanPantai extends AppCompatActivity {
    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delapan_pantai);

        mDrawerList = (ListView)findViewById(R.id.navList);
        addDrawerItems();

        initToolBar();
    }

    public void initToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        ImageButton toolbarMenu = (ImageButton) findViewById(R.id.toolbar_menu);
        setSupportActionBar(toolbar);

        final DrawerLayout mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);

        toolbarMenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mDrawerLayout.openDrawer(Gravity.LEFT);
                    }
                }
        );

    }

    public void addDrawerItems() {
        String[] osArray = {"Profil", "Change Password", "Logout"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);
    }
}
