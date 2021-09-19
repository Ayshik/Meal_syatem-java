/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harami_room_mates;

/**
 *
 * @author ayshi
 */
public class TableCreate {
    
public static void main(String[] args){

Forntpage fp=new Forntpage();
fp.setVisible(true);
try{
    for(int i=0;i<=100;i++){
        Thread.sleep(40);
        fp.lbl.setText(Integer.toString(i)+"%");
    TableCreateForm tcf=new TableCreateForm();
    if(i==100){
    
    fp.dispose();
    tcf.show();
    
    
    }
    
    
  }  
   }
 catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }




}



}
