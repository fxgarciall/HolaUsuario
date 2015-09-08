package com.example.holausuario;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Obtenemos la Referencia a los controles
		//Modificacion para probar en GitHub
		final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
		final Button btnHola = (Button)findViewById(R.id.BtnHola);
		
		btnHola.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			    //Creamos el Intent
				Intent intent = new Intent(MainActivity.this, FrmSaludo.class);
				
				//Creamos la Informacion para pasarla entre Actividades
				Bundle b = new Bundle();
				b.putString("NOMBRE", txtNombre.getText().toString());
				// Añadimos Informacion al Intent
				intent.putExtras(b);
				//Iniciamos la Nueva Actividad
				startActivity(intent);
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
