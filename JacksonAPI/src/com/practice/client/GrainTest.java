package com.practice.client;


import java.io.IOException;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

import com.practice.bean.Pulses;
import com.practice.bean.Rice;
import com.practice.bean.Wheats;
import com.practice.util.Files;
import com.practice.util.JsonUtil;

@JsonPropertyOrder({
	"name",
	"weight",
	"price"
})
public class GrainTest
{

	public static void main(String[] args) throws IOException 
	{   
		
		/**
		 * Use commented code if you want to create covert json to java object and vice-versa.
		 */
//		  Wheats w = new Wheats();
//        w.setName("Wheats");
//        w.setWeight(200);
//        w.setPrice(20.0);
//        
//        String wheatData = JsonUtil.convertJavaToJson(w);
//        System.out.println(wheatData);
//        
//        Wheats w1 = JsonUtil.convertJsonToJava(wheatData, Wheats.class);
//        System.out.println(w1.getName()+" "+ w1.getWeight()+" "+ w1.getPrice());
//        
//        Pulses p = new Pulses();
//        p.setName("Pulses");
//        p.setWeight(350);
//        p.setPrice(90.0);
//        
//        String pulsesData = JsonUtil.convertJavaToJson(p);
//        System.out.println(pulsesData);
//        
//        Pulses p1 = JsonUtil.convertJsonToJava(pulsesData, Pulses.class);
//        System.out.println(p1.getName()+" "+ p1.getWeight()+" "+ p1.getPrice());
//        
//        Rice r = new Rice();
//        r.setName("Rice");
//        r.setWeight(800);
//        r.setPrice(40.0);
//        
//        String riceData = JsonUtil.convertJavaToJson(r);
//        System.out.println(riceData);
//        
//        Rice r1 = JsonUtil.convertJsonToJava(riceData, Rice.class);
//        System.out.println(r1.getName()+" "+ r1.getWeight()+" "+ r1.getPrice());
		
		/**
		 * Coverting json to java object taking json values from file
		 */
		String path = "textstring.txt";
		String[] st = Files.readFile(path);
		
		
		Wheats w1 = JsonUtil.convertJsonToJava(st[0], Wheats.class);
		System.out.println(w1.getName()+" "+ w1.getWeight()+" "+ w1.getPrice());
		double value1 = w1.getWeight() * w1.getPrice();
		System.out.println("Value: "+value1);
		
		System.out.println("------------------------------------------");
		
		
		 Pulses p1 = JsonUtil.convertJsonToJava(st[1], Pulses.class);
		 System.out.println(p1.getName()+" "+ p1.getWeight()+" "+ p1.getPrice());
		 double value2 = p1.getWeight() * p1.getPrice();
		 System.out.println("Value: "+value2);

		 System.out.println("------------------------------------------");

		 Rice r1 = JsonUtil.convertJsonToJava(st[2], Rice.class);
		 System.out.println(r1.getName()+" "+ r1.getWeight()+" "+ r1.getPrice());
		 double value3 = r1.getWeight() * r1.getPrice();
		 System.out.println("Value: "+value3);
	}

}
