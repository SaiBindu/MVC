package com.cg.mvcspring.service;

import java.util.List;

import com.cg.mvcspring.dto.Mobile;

public interface IMobileService {

	public void addMobile(Mobile mobile);
	public List<Mobile> showAllMobile();
	public void deleteMobile(int mobId);
	public Mobile searchMobile(int mobId);
}
