package lifecycle.inc.xphoto;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class Adepter extends BaseAdapter {
    int[] flags;
    private String[] contentName;
    private Context context;
    private LayoutInflater inflater;

    Adepter (Context context, String[] countryNames, int[]flags){
        this.context=context;
        this.contentName=contentName;
        this.flags=flags;
    }

    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int r) {
        return null;
    }

    @Override
    public long getItemId(int t) {
        return 2;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.adepter_layout,viewGroup,false);
        }
        ImageView imageView = view.findViewById(R.id.adepterImageViewId);
        // TextView textView = view.findViewById(R.id.adepterTextViewId);

        imageView.setImageResource(flags[i]);
        // textView.setText("images");


        return view;
    }
}
