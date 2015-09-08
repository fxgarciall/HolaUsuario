package com.example.holausuario;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class FrmSaludo extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
       
    	//Localizar los Controles
		//Modificacion al Saludo
    	TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
    	
    	//Recuperar la info pasada en el Intent
    	Bundle bundle = this.getIntent().getExtras();
    	
    	//Construimos el mensaje a mostrar
    	final String nombre = bundle.getString("NOMBRE");
    	
        txtSaludo.setText("Hola " + nombre + ", Bienvenido!");
	
	}
	

	
	
}
