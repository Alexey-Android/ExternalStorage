package com.example.externalstorage;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.File;

public class SettingsActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_PERMISSION_READ_STORAGE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // проверить и запросить у пользователя разрешения на работу с внешним файловым хранилищем
        int permissionStatus = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
        // добавить проверку полученного статуса
        if (permissionStatus == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(SettingsActivity.this, "permission granted1", Toast.LENGTH_LONG).show();
            //LoadImg();
        } else {
            // если проверка не пройдена надо запросить разрешение, возникнет диалоговое окно
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_CODE_PERMISSION_READ_STORAGE);
        }

        init();
    }

    private void init() {

        Button btn_changeBackground;
        EditText picture;

        btn_changeBackground = findViewById(R.id.button_changeBackground);
        picture = findViewById(R.id.editText_picture);

        btn_changeBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadImg();
            }
        });

    }

    // После метода onCreate надо переопределить метод onRequestPermissionsResult, который обработает результат запроса у пользователя разрешения
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CODE_PERMISSION_READ_STORAGE:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    Toast.makeText(SettingsActivity.this, "permission granted2", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(SettingsActivity.this, "permission denied", Toast.LENGTH_LONG).show();
                }
                return;
        }
    }

    private void LoadImg() {
        if (isExternalStorageWritable()) {
            Toast.makeText(SettingsActivity.this, "ExternalStorageWritable", Toast.LENGTH_LONG).show();
            // открыть файл
            File picFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "s600 (2).webp");
            // загрузка картинки в память
            Bitmap bitmap = BitmapFactory.decodeFile(picFile.getAbsolutePath());
            ImageView image = findViewById(R.id.imageView);
            // вывести картинку в imageView
            image.setImageBitmap(bitmap);

        } else {
            Toast.makeText(SettingsActivity.this, "файл не найден", Toast.LENGTH_LONG).show();
        }
    }

    //  проверка доступности хранилища
    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }


}

