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


public class model_activity extends AppCompatActivity {

    private ListView modelListView;
    private String[] modelContent;
    private int[] Images = {
            //1-10
            R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven, R.drawable.eight,R.drawable.nine,R.drawable.ten,
            //11-20
            R.drawable.eleven,R.drawable.twelve,R.drawable.thirteen,R.drawable.fourteen,R.drawable.fifteen,R.drawable.sixteen,R.drawable.seventeen, R.drawable.eighteen,R.drawable.nineteen,R.drawable.twenty,
            //21-30
            R.drawable.twentyone,R.drawable.twentytwo,R.drawable.twentythree,R.drawable.twentyfour,R.drawable.twentyfive,R.drawable.twentysix,R.drawable.twentyseven, R.drawable.twentyeight,R.drawable.twentynine,R.drawable.thirty,
            //31-40
            R.drawable.thirtyone,R.drawable.thirtytwo,R.drawable.thirtythree,R.drawable.thirtyfour,R.drawable.thirtyfive,R.drawable.thirtysix,R.drawable.thirtyseven, R.drawable.thirtyeight,R.drawable.thirtynine,R.drawable.forty,
            //41-50
            R.drawable.fortyone,R.drawable.fortytwo,R.drawable.fortythree,R.drawable.fortyfour,R.drawable.fortyfive,R.drawable.fortysix,R.drawable.fortyseven, R.drawable.fortyeight,R.drawable.fortynine,R.drawable.fifty,
            //51-60
            R.drawable.fiftyone,R.drawable.fiftytwo,R.drawable.fiftythree,R.drawable.fiftyfour,R.drawable.fiftyfive,R.drawable.fiftysix,R.drawable.fiftyseven, R.drawable.fiftyeight,R.drawable.fiftynine,R.drawable.sixty,
            //61-70
            R.drawable.sixtyone,R.drawable.sixtytwo,R.drawable.sixtythree,R.drawable.sixtyfour,R.drawable.sixtyfive,R.drawable.sixtysix,R.drawable.sixtyseven, R.drawable.sixtyeight,R.drawable.sixtynine,R.drawable.seventy,
            //71-80
            R.drawable.seventyone,R.drawable.seventytwo,R.drawable.seventythree,R.drawable.seventyfour,R.drawable.seventyfive,R.drawable.seventysix,R.drawable.seventyseven, R.drawable.seventyeight,R.drawable.seventynine,R.drawable.eighty,
            //81-90
            R.drawable.eightyone,R.drawable.eightytwo,R.drawable.eightythree,R.drawable.eightyfour,R.drawable.eightyfive,R.drawable.eightysix,R.drawable.eightyseven, R.drawable.eightyeight,R.drawable.eightynine,R.drawable.ninety,
            //90-100
            R.drawable.ninetyone,R.drawable.ninetytwo,R.drawable.ninetythree,R.drawable.ninetyfour,R.drawable.ninetyfive,R.drawable.ninetysix,R.drawable.ninetyseven, R.drawable.ninetyeight,R.drawable.ninetynine,R.drawable.hounded,R.drawable.onehounded,
            //101-110
            R.drawable.onehoundedone,R.drawable.onehoundedtwo,R.drawable.onehoundedthree,R.drawable.onehoundedfour,R.drawable.onehoundedfive,R.drawable.onehoundedsix,R.drawable.onehoundedseven, R.drawable.onehoundedeight,R.drawable.onehoundednine,R.drawable.onehoundedten,
            //111-120
            R.drawable.onehoundedeleven,R.drawable.onehoundedtwelve,R.drawable.onehoundedthirteen,R.drawable.onehoundedfourteen,R.drawable.onehoundedfifteen,R.drawable.onehoundedsixteen,R.drawable.onehoundedseventeen, R.drawable.onehoundedeighteen,R.drawable.onehoundednineteen,R.drawable.onehoundedtwenty,
            //121-130
            R.drawable.onehoundedtwentyone,R.drawable.onehoundedtwentytwo,R.drawable.onehoundedtwentythree,R.drawable.onehoundedtwentyfour,R.drawable.onehoundedtwentyfive,R.drawable.onehoundedtwentysix,R.drawable.onehoundedtwentyseven, R.drawable.onehoundedtwentyeight,R.drawable.onehoundedtwentynine,R.drawable.onehoundedthirty,
            //131-140
            R.drawable.onehoundedthirtyone,R.drawable.onehoundedthirtytwo,R.drawable.onehoundedthirtythree,R.drawable.onehoundedthirtyfour,R.drawable.onehoundedthirtyfive,R.drawable.onehoundedthirtysix,R.drawable.onehoundedthirtyseven, R.drawable.onehoundedthirtyeight,R.drawable.onehoundedthirtynine,R.drawable.onehoundedforty,
            //141-150
            R.drawable.onehoundedfortyone,R.drawable.onehoundedfortytwo,R.drawable.onehoundedfortythree,R.drawable.onehoundedfortyfour,R.drawable.onehoundedfortyfive,R.drawable.onehoundedfortysix,R.drawable.onehoundedfortyseven, R.drawable.onehoundedfortyeight,R.drawable.onehoundedfortynine,R.drawable.onehoundedfifty,
            //151-160
            R.drawable.onehoundedfiftyone,R.drawable.onehoundedfiftytwo,R.drawable.onehoundedfiftythree,R.drawable.onehoundedfiftyfour,R.drawable.onehoundedfiftyfive,R.drawable.onehoundedfiftysix,R.drawable.onehoundedfiftyseven, R.drawable.onehoundedfiftyeight,R.drawable.onehoundedfiftynine,R.drawable.onehoundedsixty,
            //161-170
            R.drawable.onehoundedsixtyone,R.drawable.onehoundedsixtytwo,R.drawable.onehoundedsixtythree,R.drawable.onehoundedsixtyfour,R.drawable.onehoundedsixtyfive,R.drawable.onehoundedsixtysix,R.drawable.onehoundedsixtyseven, R.drawable.onehoundedsixtyeight,R.drawable.onehoundedsixtynine,R.drawable.onehoundedseventy,
            //171-180
            R.drawable.onehoundedseventyone,R.drawable.onehoundedseventytwo,R.drawable.onehoundedseventythree,R.drawable.onehoundedseventyfour,R.drawable.onehoundedseventyfive,R.drawable.onehoundedseventysix,R.drawable.onehoundedseventyseven, R.drawable.onehoundedseventyeight,R.drawable.onehoundedseventynine,R.drawable.onehoundedeighty,
            //181-190
            R.drawable.onehoundedeightyone,R.drawable.onehoundedeightytwo,R.drawable.onehoundedeightythree,R.drawable.onehoundedeightyfour,R.drawable.onehoundedeightyfive,R.drawable.onehoundedeightysix,R.drawable.onehoundedeightyseven, R.drawable.onehoundedeightyeight,R.drawable.onehoundedeightynine,R.drawable.onehoundedninety,
            //191-200
            R.drawable.onehoundedninetyone,R.drawable.onehoundedninetytwo,R.drawable.onehoundedninetythree,R.drawable.onehoundedninetyfour,R.drawable.onehoundedninetyfive,R.drawable.onehoundedninetysix,R.drawable.onehoundedninetyseven, R.drawable.onehoundedninetyeight,R.drawable.onehoundedninetynine,R.drawable.twohounded,
            //201-210
            R.drawable.twohoundedone,R.drawable.twohoundedtwo,R.drawable.twohoundedthree,R.drawable.twohoundedfour,R.drawable.twohoundedfive,R.drawable.twohoundedsix,R.drawable.twohoundedseven, R.drawable.twohoundedeight,R.drawable.twohoundednine,R.drawable.twohoundedten,
            //211-220
            R.drawable.twohoundedeleven,
            //R.drawable.twohoundedtwelve,
            R.drawable.twohoundedthirteen,
            //R.drawable.twohoundedfourteen,
            R.drawable.twohoundedfifteen,R.drawable.twohoundedsixteen,R.drawable.twohoundedseventeen, R.drawable.twohoundedeighteen,R.drawable.twohoundednineteen,R.drawable.twohoundedtwenty,
            //221-230
            R.drawable.twohoundedtwentyone,R.drawable.twohoundedtwentytwo,R.drawable.twohoundedtwentythree,R.drawable.twohoundedtwentyfour,R.drawable.twohoundedtwentyfive,R.drawable.twohoundedtwentysix,R.drawable.twohoundedtwentyseven,
            //R.drawable.twohoundedtwentyeight,
            R.drawable.twohoundedtwentynine,R.drawable.twohoundedthirty,
            //231-240
            R.drawable.twohoundedthirtyone,R.drawable.twohoundedthirtytwo,R.drawable.twohoundedthirtythree,R.drawable.twohoundedthirtyfour,R.drawable.twohoundedthirtyfive,R.drawable.twohoundedthirtysix,R.drawable.twohoundedthirtyseven, R.drawable.twohoundedthirtyeight,R.drawable.twohoundedthirtynine,

            //R.drawable.twohoundedforty,


            R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven, R.drawable.eight,R.drawable.nine,R.drawable.twohoundedfifty,


            //251-260
            R.drawable.twohoundedfiftyone,R.drawable.twohoundedfiftytwo,R.drawable.twohoundedfiftythree,R.drawable.twohoundedfiftyfour,R.drawable.twohoundedfiftyfive,R.drawable.twohoundedfiftysix,R.drawable.twohoundedfiftyseven, R.drawable.twohoundedfiftyeight,R.drawable.twohoundedfiftynine,R.drawable.twohoundedsixty,
            //261-270
            R.drawable.twohoundedsixtyone,R.drawable.twohoundedsixtytwo,R.drawable.twohoundedsixtythree,R.drawable.twohoundedsixtyfour,R.drawable.twohoundedsixtyfive,R.drawable.twohoundedsixtysix,R.drawable.twohoundedsixtyseven, R.drawable.twohoundedsixtyeight,R.drawable.twohoundedsixtynine,R.drawable.twohoundedseventy,
            //270-280
            R.drawable.twohoundedseventyone,R.drawable.twohoundedseventytwo,R.drawable.twohoundedseventythree,R.drawable.twohoundedseventyfour,R.drawable.twohoundedseventyfive,R.drawable.twohoundedseventysix,R.drawable.twohoundedseventyseven, R.drawable.twohoundedseventyeight,R.drawable.twohoundedseventynine,R.drawable.twohoundedeighty,
            //281-290
            R.drawable.twohoundedeightyone,R.drawable.twohoundedeightytwo,R.drawable.twohoundedeightythree,R.drawable.twohoundedeightyfour,R.drawable.twohoundedeightyfive,R.drawable.twohoundedeightysix,R.drawable.twohoundedeightyseven, R.drawable.twohoundedeightyeight,R.drawable.twohoundedeightynine,R.drawable.twohoundedninety,
            //291-300
            R.drawable.twohoundedninetyone,R.drawable.twohoundedninetytwo,R.drawable.twohoundedninetythree,R.drawable.twohoundedninetyfour,R.drawable.twohoundedninetyfive,R.drawable.twohoundedninetysix,R.drawable.twohoundedninetyseven, R.drawable.twohoundedninetyeight,R.drawable.twohoundedninetynine,R.drawable.threehounded,
            //301-310
            R.drawable.threehoundedone,R.drawable.threehoundedtwo,R.drawable.threehoundedthree,R.drawable.threehoundedfour,R.drawable.threehoundedfive,R.drawable.threehoundedsix,R.drawable.threehoundedseven, R.drawable.threehoundedeight,R.drawable.threehoundednine,R.drawable.threehoundedten,
            //311-320
            R.drawable.threehoundedeleven,R.drawable.threehoundedtwelve,R.drawable.threehoundedthirteen,R.drawable.threehoundedfourteen,R.drawable.threehoundedfifteen,//R.drawable.threehoundedsixteen,
            R.drawable.threehoundedseventeen, R.drawable.threehoundedeighteen,R.drawable.threehoundednineteen,R.drawable.threehoundedtwenty,
            //321-330
            R.drawable.threehoundedtwentyone,R.drawable.threehoundedtwentytwo,R.drawable.threehoundedtwentythree,R.drawable.threehoundedtwentyfour,R.drawable.threehoundedtwentyfive,R.drawable.threehoundedtwentysix,R.drawable.threehoundedtwentyseven, R.drawable.threehoundedtwentyeight,R.drawable.threehoundedtwentynine,R.drawable.threehoundedthirty,
            //331-340
            R.drawable.threehoundedthirtyone,R.drawable.threehoundedthirtytwo,R.drawable.threehoundedthirtythree,R.drawable.threehoundedthirtyfour,R.drawable.threehoundedthirtyfive,R.drawable.threehoundedthirtysix,R.drawable.threehoundedthirtyseven, R.drawable.threehoundedthirtyeight,R.drawable.threehoundedthirtynine,R.drawable.threehoundedforty,
            //341-350
            R.drawable.threehoundedfortyone,R.drawable.threehoundedfortytwo,R.drawable.threehoundedfortythree,R.drawable.threehoundedfortyfour,R.drawable.threehoundedfortyfive,R.drawable.threehoundedfortysix,R.drawable.threehoundedfortyseven, R.drawable.threehoundedfortyeight,R.drawable.threehoundedfortynine,
            //R.drawable.threehoundedfifty,

            //351-360
            R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven, R.drawable.eight,R.drawable.nine,R.drawable.ten,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_baseline_home);


        modelContent = getResources().getStringArray(R.array.content_name);

        modelListView=findViewById(R.id.modelListViewId);

        Adepter adepter = new Adepter(this,modelContent,Images);
        modelListView.setAdapter(adepter);

        modelListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(model_activity.this,display_activity.class);
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