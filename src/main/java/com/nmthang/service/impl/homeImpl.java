package com.nmthang.service.impl;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.nmthang.service.homeServeice;

@Service
public class homeImpl implements homeServeice{

	@Override
	public ArrayList<String> loadMenu() {
		// TODO Auto-generated method stub
		ArrayList<String> menus = new ArrayList<String>();
		menus.add("Nguyen");
		menus.add("Minh");
		menus.add("Thang");
		return menus;
	}

}
