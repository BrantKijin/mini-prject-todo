package com.spring;

import com.spring.ai.console.ConsoleInputHandler;
import com.spring.ai.console.ConsoleMenu;
import com.spring.ai.console.ConsolePrinter;

public class TodoApplication {
	public static void run(){

		while (true){
			// (1) 할일 관리 메뉴 조회
			String todoMenu = ConsoleMenu.getMenuDescroption();

			// (2) 할 일 관리 메뉴 출력
			ConsolePrinter.println(todoMenu);

			// (3) 할 일 관리 메뉴 선택
			selectMenu();
		}

	}

	private static void selectMenu() {
		String selectedMenuNumber = ConsoleInputHandler.inputValue();
		//System.out.println(selectedMenuNumber);
		// TodoConsoleHandler 클래스의 메서드를 호출하는 로직이 추가 되야 합니다
	}
}
