package com.example.basededatos2023juanka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtitulo, txtisbn, txteditorial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txteditorial = (EditText) findViewById(R.id.txteditorial);
        txtisbn = (EditText) findViewById(R.id.txtisbn);
        txtitulo = (EditText) findViewById(R.id.txtitulo);
    }
    //Método para dar de alta a los productos
    public void Registrar (View view){
        // Instanciamos la base de datos con los cuatro argumentos
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        // Abrimos la base de datos en modo lectura y escritura
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String titulo = txtitulo.getText().toString();
        String isbn = txtisbn.getText().toString();
        String editodial = txteditorial.getText().toString();

        if(!titulo.isEmpty() && !isbn.isEmpty()&& !editodial.isEmpty()){
            ContentValues registro = new ContentValues();

            // Guardamos en la base de datos los valores que el usuario ha escrito
            registro.put("editodial", editodial);
            registro.put("titulo", titulo);
            registro.put("isbn", isbn);

            // Los insertamos dentro de la tabla "articulos" que hemos creado
            BaseDeDatos.insert("articulos", null, registro);

            // Cerramos la base de datos
            BaseDeDatos.close();

            //Limpiamos los campos
            txteditorial.setText("");
            txtisbn.setText("");
            txtitulo.setText("");

            Toast.makeText(this, "El producto se ha grabado de forma correcta", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "Debes rellenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    // Buscar artículos
    public void Buscar (View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        // Abrimos la base de datos en modo lectura y escritura
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String titulo = txtitulo.getText().toString();

        if(!titulo.isEmpty()){
            //Seleccionamos los registros con el código
            Cursor fila = BaseDeDatos.rawQuery("select descripcion, precio from articulos where codigo =" + titulo, null);

            // Revisamos si la consulta contiene valores
            if(fila.moveToFirst()){
                txtitulo.setText(fila.getString(0)); //Se pone el cero por que es el primer valor que vamos a mostrar
                txtisbn.setText(fila.getString(1));
                BaseDeDatos.close();
            }else{
                Toast.makeText(this, "El artículo no existe", Toast.LENGTH_SHORT).show();
                BaseDeDatos.close();
            }
        }else{
            Toast.makeText(this, "Debes introducir el código del artículo", Toast.LENGTH_SHORT).show();
        }

    }

    // Método para elimiar un producto
    public void Eliminar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String titulo = txtitulo.getText().toString();

        if(!titulo.isEmpty()){
            int cantidad = BaseDeDatos.delete("articulos", "codigo=" + titulo, null);
            BaseDeDatos.close();

            txtitulo.setText("");
            txteditorial.setText("");
            txtisbn.setText("");

            if(cantidad == 1){
                Toast.makeText(this, "El artículo se ha borrado correctamente", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "El artículo no existe", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Debes introducir el artículo del código", Toast.LENGTH_SHORT).show();
        }
    }

    // Método para modificar artículo
    public void Modificar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String titulo = txtitulo.getText().toString();
        String editorial = txteditorial.getText().toString();
        String isbn = txtisbn.getText().toString();

        if(!titulo.isEmpty() && !isbn.isEmpty() && !editorial.isEmpty()){

            ContentValues registro = new ContentValues();
            registro.put("titulo", titulo);
            registro.put("isbn", isbn);
            registro.put("editorial", editorial);

            int cantidad = BaseDeDatos.update("articulos", registro, "codigo=" + titulo, null);
            BaseDeDatos.close();

            if(cantidad == 1){
                Toast.makeText(this, "El artículo se ha modificado correctamente", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "El artículo no existe", Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(this, "Debes rellenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    // Método para limpiar la pantalla de datos
    public void Limpiar(View view){
        txtisbn.setText("");
        txtitulo.setText("");
        txteditorial.setText("");
    }
}
