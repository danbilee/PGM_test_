package com.hhi.vaas.platform.pgm.test;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Json {
	
	private JSONArray almArr;
	private JSONArray confArr;
	private JSONArray sensArr;

	
	public Json() {
		almArr = new JSONArray();
		confArr = new JSONArray();
		sensArr = new JSONArray();
	}
		
	void almMake(){
		
		//ALARM DATA sample
		JSONObject almObj1 = new JSONObject();
		almObj1.put("key", "MS014");
		almObj1.put("MS014@ALM.desc", "M/E No.2 CYL EXHGAS OUT TEMP");
		almObj1.put("MS014@ALM.signalType", "Analog");
		almObj1.put("MS014@ALM.alarmType", "ALARM");
		almObj1.put("MS014@ALM.alarmLevel", "HIGH");
		almObj1.put("MS014@ALM.ststus", "ALM");
		almObj1.put("MS014@ALM.alarmTime", "1438236646000");
		almObj1.put("MS014@ALM.ackTime", "");
		almObj1.put("MS014@ALM.normalTime", "");
		almObj1.put("MS014@ALM.instVal", "460.00");
		almArr.add(almObj1);
		
		JSONObject almObj2 = new JSONObject();
		almObj1.put("key", "MS014");
		almObj1.put("MS014@ALM.desc", "M/E No.2 CYL EXHGAS OUT TEMP");
		almObj1.put("MS014@ALM.signalType", "Analog");
		almObj1.put("MS014@ALM.alarmType", "ALARM");
		almObj1.put("MS014@ALM.alarmLevel", "HIGH");
		almObj1.put("MS014@ALM.ststus", "NOR");
		almObj1.put("MS014@ALM.alarmTime", "1438236646000");
		almObj1.put("MS014@ALM.ackTime", "");
		almObj1.put("MS014@ALM.normalTime", "");
		almObj1.put("MS014@ALM.instVal", "460.00");
		almArr.add(almObj2);
		
	}
	
	void confMake(){
		
		//CONFIG DATA sample
		JSONObject confObj1 = new JSONObject();
		confObj1.put("key", "MS014");
		confObj1.put("MS014.EGU", "deg.C");
		confObj1.put("MS014.Type", "Analog");
		confObj1.put("MS014.SmpRate", "1000");
		confObj1.put("MS014.EGUL", "0.000000");
		confObj1.put("MS014.EGUH", "600.000000");
		confObj1.put("MS014@HH.LMT", "470.000000");
		confObj1.put("MS014@HI.LMT", "450.00000");
		confObj1.put("MS014@LL.LMT", "");
		confObj1.put("MS014@LO.LMT", "");
		
		JSONObject confObj2 = new JSONObject();
		confObj2.put("key", "MW035");
		confObj2.put("MW035.EGU", "");
		confObj2.put("MW035.Type", "Digital");
		confObj2.put("", "1000");
		
		confArr.add(confObj1);
		confArr.add(confObj2);
	}
	
	void sensMake() {
		
		//SENSOR DATA sample
		JSONObject sensObj1 = new JSONObject();
		sensObj1.put("IP008", "0.000000");
		sensObj1.put("IP008@HH", "0.000000");
		sensObj1.put("IP008@HI", "0.000000");
		sensObj1.put("IP008@LL", "0.000000");
		sensObj1.put("IP008@LO", "0.000000");
		sensObj1.put("IP009", "0.000000");
		sensObj1.put("IP009@HH", "0.000000");
		sensObj1.put("IP009@HI", "0.000000");
		sensObj1.put("IP009@LL", "0.000000");
		sensObj1.put("IP009@LO", "0.000000");
		sensObj1.put("IP0010", "0.000000");
		sensObj1.put("IP0010@HH", "0.000000");
		sensObj1.put("IP0010@HI", "0.000000");
		sensObj1.put("IP0010@LL", "0.000000");
		sensObj1.put("IP0010@LO", "0.000000");
		sensObj1.put("IP0011", "0.000000");
		sensObj1.put("IP0011@HH", "0.000000");
		sensObj1.put("IP0011@HI", "0.000000");
		sensObj1.put("IP0011@LL", "0.000000");
		sensObj1.put("IP0011@LO", "0.000000");		
		sensObj1.put("IP0012", "0.000000");
		sensObj1.put("IP0012@HH", "0.0000000");
		sensObj1.put("IP0012@HI", "0.000000");
		sensObj1.put("IP0012@LL", "0.000000");
		sensObj1.put("IP0012@LO", "0.000000");
		sensObj1.put("IP013", "0.000000");
		sensObj1.put("IP013@OF", "1.000000");
		sensObj1.put("IP013@ON", "0.000000");
		sensObj1.put("IP014", "0.000000");
		sensObj1.put("IP014@OF", "1.000000");
		sensObj1.put("IP014@ON", "0.000000");
		sensObj1.put("LIST_1", "0.000000");
		sensObj1.put( "LIST_1@HH", "0.000000");
		sensObj1.put("LIST_1@HI", "0.000000");
		sensObj1.put("LIST_1@LL", "0.000000");
		sensObj1.put("LIST_1@LO", "0.000000");
		sensObj1.put("LIST_2", "0.000000");
		sensObj1.put("LIST_2@HH", "0.000000");
		sensObj1.put("LIST_2@HI", "0.000000");
		sensObj1.put( "LIST_2@LL", "0.000000");
		sensObj1.put("LIST_2@LO", "0.000000");
		sensObj1.put("LIT-1311", "0.000000");
		sensObj1.put("LIT-1311@HH", "0.000000");
		sensObj1.put( "LIT-1311@HI", "0.000000");
		sensObj1.put("LIT-1311@LL", "0.000000");
		sensObj1.put("LIT-1311@LO", "0.000000");
		sensObj1.put("LIT-1311_LL", "0.000000");
		sensObj1.put( "LIT-1311_LL@OF", "1.000000");
		sensObj1.put( "LIT-1311_LL@ON", "0.000000");
		sensObj1.put( "LIT-1311_LO", "0.000000");
		sensObj1.put( "LIT-1311_LO@OF", "1.000000");
		sensObj1.put( "LIT-1311_LO@ON", "0.000000");
		sensObj1.put("LOW_SALINITY", "0.000000");
		sensObj1.put("LOW_SALINITY@OF", "1.000000");
		sensObj1.put("LOW_SALINITY@ON", "0.000000");
		sensObj1.put("LS-1111", "0.000000");
		sensObj1.put("LS-1111@OF", "1.000000");
		sensObj1.put("LS-1111@ON", "0.000000");
		sensObj1.put("LS-1111_LO", "0.000000");
		sensObj1.put("LS-1111_LO@OF", "1.000000");
		sensObj1.put("LS-1111_LO@ON", "0.000000");
		sensObj1.put("LS-1141", "0.000000");
		sensObj1.put("LS-1141@OF", "1.000000");
		sensObj1.put("LS-1141@ON", "0.000000");
		sensObj1.put( "LS-1141_HH", "0.000000");
		sensObj1.put("LS-1141_HH@OF", "1.000000");
		sensObj1.put("LS-1141_HH@ON", "0.000000");
		sensObj1.put("LS-1141_HI", "0.000000");
		sensObj1.put("LS-1141_HI@OF", "1.000000");
		sensObj1.put("LS-1141_HI@ON", "0.000000");
		sensObj1.put("MC001", "1.000000");
		sensObj1.put( "MC001@OF", "0.000000");
		sensObj1.put("MC001@ON", "1.000000");
		sensObj1.put("MC002", "1.000000");
		sensObj1.put(  "MC002@OF", "0.000000");
		sensObj1.put( "MC002@ON", "1.000000");
		sensObj1.put( "MC003", "1.000000");
		sensObj1.put( "MC003@OF", "0.000000");
	    sensObj1.put( "MC003@ON", "1.000000");
	    sensObj1.put( "MC004", "1.000000");
	    sensObj1.put( "MC004@OF", "0.000000");
  	    sensObj1.put( "MC004@ON", "1.000000");
	    sensObj1.put( "MC005", "1.000000");
	    sensObj1.put( "MC005@OF", "0.000000");
  	    sensObj1.put(  "MC005@ON", "1.000000");
	    sensObj1.put( "MC006", "1.000000");
	    sensObj1.put(  "MC006@OF", "0.000000");
	    sensObj1.put( "MC006@ON", "1.000000");
	    sensObj1.put("MC007", "1.000000");
	    sensObj1.put( "MC007@OF", "0.000000");
	    sensObj1.put( "MC007@ON", "1.000000");
	    sensObj1.put( "MC008", "1.000000");
	    sensObj1.put( "MC008@OF", "0.000000");
	    sensObj1.put( "MC008@ON", "1.000000");
	    sensObj1.put( "MC009", "1.000000");
	    sensObj1.put("MC009@OF", "0.000000");
	    sensObj1.put("MC009@ON", "1.000000");
	    sensObj1.put("MC010", "1.000000");
	    sensObj1.put("MC010@OF", "0.000000");
	    sensObj1.put("MC010@ON", "1.000000");
	    sensArr.add(sensObj1);
	}
	
	void almFMake(){
		try {
			FileWriter almF = new FileWriter("./test_alm.txt");
			almF.write(almArr.toJSONString());
			almF.flush();
			
			almF.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void confFMake(){	
		try {
			FileWriter confF = new FileWriter("./test_conf.txt");
			confF.write(confArr.toJSONString());
			confF.flush();
			
			confF.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
	}
	
	public void sensFMake() {
		try {
			FileWriter sensF = new FileWriter("./test_sens.txt");
			sensF.write(sensArr.toJSONString());
			sensF.flush();
			
			sensF.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	int getAlmNum() {
		return almArr.size();
	}
	
	int getConfNum() {
		return confArr.size();
	}
	
	public void getAlm() {
		almMake();
		almFMake();
	}
	
	public void getConf() {
		confMake();
		confFMake();
	}
	public void getSens() {
		sensMake();
		sensFMake();
	}	


}
