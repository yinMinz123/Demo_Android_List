package sg.edu.rp.c346.id20039202.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<AndroidVersion> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row  / change xml into codes
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvVersion = rowView.findViewById(R.id.textViewVersion);

        // Obtain the Android Version information based on the position
        AndroidVersion currentVersion = versionList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentVersion.getName());
        tvVersion.setText(currentVersion.getVersion());

        return rowView;
    }

}
