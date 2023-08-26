package lifecycle.inc.xphoto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

public class open_activity extends AppCompatActivity {

    private ListView openListView;
    private String[] modelContent;
    private int[] Images = {
            //1-10
            R.drawable.xone,R.drawable.xtwo,R.drawable.xthree,R.drawable.xfour,R.drawable.xfive,R.drawable.xsix,R.drawable.xseven, R.drawable.xeight,R.drawable.xnine,R.drawable.xten,
            //11-20
            R.drawable.xeleven,R.drawable.xtwelve,R.drawable.xthirteen,R.drawable.xfourteen, R.drawable.xfifteen,R.drawable.xsixteen,R.drawable.xseventeen, R.drawable.xeighteen,R.drawable.xnineteen,R.drawable.xtwenty,
            //21-30
            R.drawable.xtwentyone,R.drawable.xtwentytwo,R.drawable.xtwentythree,R.drawable.xtwentyfour,R.drawable.xtwentyfive,R.drawable.xtwentysix,R.drawable.xtwentyseven, R.drawable.xtwentyeight,R.drawable.xtwentynine,R.drawable.xthirty,
            //31-40
            R.drawable.xthirtyone,R.drawable.xthirtytwo,R.drawable.xthirtythree,R.drawable.xthirtyfour,R.drawable.xthirtyfive,R.drawable.xthirtysix,R.drawable.xthirtyseven, R.drawable.xthirtyeight,R.drawable.xthirtynine,R.drawable.xforty,
            //41-50
            R.drawable.xfortyone,R.drawable.xfortytwo,R.drawable.xfortythree,R.drawable.xfortyfour,R.drawable.xfortyfive,R.drawable.xfortysix,R.drawable.xfortyseven, R.drawable.xfortyeight,R.drawable.xfortynine,R.drawable.xfifty,
            //51-60
            R.drawable.xfiftyone,R.drawable.xfiftytwo,R.drawable.xfiftythree,R.drawable.xfiftyfour,R.drawable.xfiftyfive,R.drawable.xfiftysix,R.drawable.xfiftyseven, R.drawable.xfiftyeight,R.drawable.xfiftynine,R.drawable.xsixty,
            //61-70
            R.drawable.xsixtyone,R.drawable.xsixtytwo,R.drawable.xsixtythree,R.drawable.xsixtyfour,R.drawable.xsixtyfive,R.drawable.xsixtysix,R.drawable.xsixtyseven, R.drawable.xsixtyeight,//R.drawable.xsixtynine,R.drawable.xseventy,


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_baseline_home);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        modelContent = getResources().getStringArray(R.array.content_name);

        openListView=findViewById(R.id.openListViewId);

        Adepter adepter = new Adepter(this,modelContent,Images);
        openListView.setAdapter(adepter);

        openListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(open_activity.this,display_activity.class);
                intent.putExtra("image_key", Images[i]);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()== android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
