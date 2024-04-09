package compito;

import java.util.Hashtable;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BCD extends Application{
	Hashtable <String,String> dizionario =  new Hashtable <String,String>();
		TextField numero = new TextField();
		Label Lris= new Label();
		public void start(Stage finestra){

			GridPane griglia= new GridPane();

			Label ltext1= new Label("Inserire numero:");
			Label ltext2= new Label("numero in BCD");
			
			Button pconvertire= new Button();
			pconvertire.setText("Converti");
			pconvertire.setOnAction(e -> calcolo());
			
			griglia.add(ltext1, 0, 0);
			griglia.add(numero, 1,0);
			griglia.add(pconvertire, 0, 1);
			griglia.add(ltext2, 0, 2);
			griglia.add(Lris, 0, 3);
			griglia.setAlignment(Pos.CENTER);
			griglia.setHgap(10);
			griglia.setVgap(5);
			
			Scene scena = new Scene(griglia, 500, 500);
			finestra.setScene(scena);
			finestra.setTitle("BCD");
			finestra.show();
			
			
			

		}
		
		private void calcolo() {
			String vettore[]= numero.getText().split("");
			String risultato= "";
			
			dizionario.put("0", "0000");
			dizionario.put("1", "0001");
			dizionario.put("2", "0010");
			dizionario.put("3", "0011");
			dizionario.put("4", "0100");
			dizionario.put("5", "0101");
			dizionario.put("6", "0110");
			dizionario.put("7", "0111");
			dizionario.put("8", "1000");
			dizionario.put("9", "1001");
			
			for(int i=0; i < vettore.length; i++) {
				risultato += dizionario.get(vettore[i]);
			}
			
			Lris.setText(risultato);
		}
		
		public static void main(String[] args) {
			launch(args);
		}
	}

