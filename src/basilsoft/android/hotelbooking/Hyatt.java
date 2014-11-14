package basilsoft.android.hotelbooking ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Hyatt extends Activity{
	
	public void onCreate(Bundle savedInstanceState){
		
	super.onCreate(savedInstanceState) ;
	setContentView(R.layout.hyatt) ;
	 View b1 = (Button)findViewById(R.id.h1) ;
     b1.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_VIEW,
					    Uri.parse("http://www.hyatt.com")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b2 = (Button)findViewById(R.id.h2) ;
     b2.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+541152184518")) ;
			            startActivity(i) ;
		}	
	
		
     }) ; 
     View b3 = (Button)findViewById(R.id.h3) ;
     b3.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+551132578855")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b4 = (Button)findViewById(R.id.h4) ;
     b4.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+5716100599")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b5 = (Button)findViewById(R.id.h5) ;
     b5.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+14025376835")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b6 = (Button)findViewById(R.id.h6) ;
     b6.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:018000050000")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b7 = (Button)findViewById(R.id.h7) ;
     b7.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:18002331234")) ;
			            startActivity(i) ;
		}	
	
		
     }) ; 
     View b8 = (Button)findViewById(R.id.h8) ;
     b8.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:131234")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b9 = (Button)findViewById(R.id.h9) ;
     b9.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+85229561234")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b10 = (Button)findViewById(R.id.h10) ;
     b10.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+18001221234")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b11 = (Button)findViewById(R.id.h11) ;
     b11.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:0120512343")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b12 = (Button)findViewById(R.id.h12) ;
     b12.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+80002001234")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b13 = (Button)findViewById(R.id.h13) ;
     b13.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:1800818188")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b14 = (Button)findViewById(R.id.h14) ;
     b14.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:0800441234")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b15 = (Button)findViewById(R.id.h15) ;
     b15.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:80011085")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b16 = (Button)findViewById(R.id.h16) ;
     b16.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+8651255001234")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b17 = (Button)findViewById(R.id.h17) ;
     b17.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+6531587887")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b18 = (Button)findViewById(R.id.h18) ;
     b18.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:08009731234")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
       
	}
}
	
