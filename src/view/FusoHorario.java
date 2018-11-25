package view;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FusoHorario {
	
	public static void main(String[] args) {
		
		ZoneId saoPaulo = ZoneId.of("UTC-3");
		ZoneId londres = ZoneId.of("UTC+1");
		ZoneId moscou = ZoneId.of("UTC+3");
		ZoneId toquio = ZoneId.of("UTC+9");
		ZoneId alaska = ZoneId.of("UTC-8");
		
		ZonedDateTime saoPauloTime = ZonedDateTime.now(saoPaulo);
		ZonedDateTime londresTime = ZonedDateTime.now(londres);
		ZonedDateTime moscouTime = ZonedDateTime.now(moscou);
		ZonedDateTime toquioTime = ZonedDateTime.now(toquio);
		ZonedDateTime alaskaTime = ZonedDateTime.now(alaska);
		
		System.out.println("São Paulo: " + saoPauloTime.getHour()+ " horas e " + saoPauloTime.getMinute() + " minutos");
		System.out.println("Londres: " + londresTime.getHour() + " horas e " + londresTime.getMinute() + " minutos");
		System.out.println("Moscou: " + moscouTime.getHour() + " horas e " + moscouTime.getMinute() + " minutos");
		System.out.println("Tóquio: " + toquioTime.getHour() + " horas e " + toquioTime.getMinute() + " minutos");
		System.out.println("Alaska: " + alaskaTime.getHour() + " horas e " + alaskaTime.getMinute() + " minutos");
	
	}
}
