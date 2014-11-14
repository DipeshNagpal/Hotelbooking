package basilsoft.android.hotelbooking ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Viventa extends Activity{
	
	public void onCreate(Bundle savedInstanceState){
		
	super.onCreate(savedInstanceState) ;
	setContentView(R.layout.viventa) ;
	 View b1 = (Button)findViewById(R.id.v1) ;
     b1.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_VIEW,
					    Uri.parse("http://www.viventabytaj.com")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b2 = (Button)findViewById(R.id.v2) ;
     b2.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+08000381422")) ;
			            startActivity(i) ;
		}	
	
		
     }) ; 
     View b3 = (Button)findViewById(R.id.v3) ;
     b3.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+18669691825")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b4 = (Button)findViewById(R.id.v4) ;
     b4.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+1800111825")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b6 = (Button)findViewById(R.id.v6) ;
     b6.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+912266011825")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b5 = (Button)findViewById(R.id.v5) ;
     b5.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+0080045881825")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
       
      
	}
}
	
