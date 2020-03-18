package com.example.project;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ProductAdapter extends BaseAdapter {

    private List<Integer> images;
    private List<String> names;
    private Context applicationContext;
    private LayoutInflater inflater;
    public ProductAdapter(Context applicationContext,List<Integer> imageIds,List<String> names)
    {
       this.applicationContext=applicationContext;
       this.images=imageIds;
       this.names=names;

       inflater=LayoutInflater.from(applicationContext);
    }
    @Override
    public long getItemId(int position){
        return 0;
    }
    @Override
    public int getCount()
    {
        return names.size();
    }
    @Override
    public Object getItem(int position){
        return null;
    }
    @Override
    public View getView(int Position, View convertView, ViewGroup parent)
    {
        View view=inflater.inflate(R.layout.griditems,root: null);
       ImageView img= view.findViewById(R.id.imageview);
       img.setImageResource(images.get(position));

      TextView name=view.findViewById(R.id.textView) ;
      name.setText(names.get(position));
     return view;
    }
}

