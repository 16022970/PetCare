//package com.example.a16022970.petcare;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//public class PetsAdapter extends ArrayList<Pets> {
//
//    private Context context;
//    private ArrayList<Pets> pet;
//    private TextView petName;
//    private ImageView ivPet;
//
//    public PetsAdapter(Context context, int resource, ArrayList<Pets>objects){
//        super(context,resource,objects);
//        pet = objects;
//        this.context = context;
//    }
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        LayoutInflater inflater = (LayoutInflater) context
//                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View rowView = inflater.inflate(R.layout.row, parent, false);
//
//        petName = (TextView) rowView.findViewById(R.id.petName);
//        ivPet = (ImageView) rowView.findViewById(R.id.ivPet);
//
//        Pets currentPet = pet.get(position);
//
//        petName.setText(currentPet.getName());
//        for(int i = 0;i<pet.size();i++){
//
//            }
//
//        return rowView;
//    }
//
//}
