package com.example.a16022970.petcare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity implements View.OnClickListener{
    public static final int RESULT_LOAD_IMAGE = 1;
    ImageView imageToUpload;
    Button btnUpload;
    EditText name;
    EditText breed;
    EditText dob;
    EditText xtra;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_activity);

        imageToUpload = (ImageView)findViewById(R.id.imageView3);
        btnUpload = (Button)findViewById(R.id.buttonAddPet);

        imageToUpload.setOnClickListener(this);
        btnUpload.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.imageView3:
                Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
                break;

            case R.id.buttonAddPet:
            if(name == null || breed == null || dob == null){
                Toast.makeText(this, "Please fill in blanks", Toast.LENGTH_LONG).show();
            }
//            else{
//
//            }
            break;
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && data != null){
            Uri selectedImage = data.getData();
            imageToUpload.setImageURI(selectedImage);
        }




    }
}
