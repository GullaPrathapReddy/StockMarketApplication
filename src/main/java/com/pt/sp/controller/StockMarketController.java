package com.pt.sp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pt.sp.dto.StockCatagaryDTO;
import com.pt.sp.service.StockMarketService;
import com.pt.sp.utility.LoggerUtility;

@RestController
public class StockMarketController {
	@Autowired
	private StockMarketService service;
	
	private static Logger logger=null;
		
	public StockMarketController() {
		logger=LoggerUtility.getloggerInstance();
		logger.info("StockMarketController Obj Created");
		
	}
	@CrossOrigin(origins="*" ,allowedHeaders="*")
	@RequestMapping(value="/stockcatagory",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
	public List<StockCatagaryDTO> SendRestData(HttpServletResponse res){
		logger=LoggerUtility.getloggerInstance();
		logger.info("Sending Data from RestController");
		List<StockCatagaryDTO> stocklist=null;
		stocklist=service.SendStockCatagory();
		res.setIntHeader("Refresh", 5);
		return stocklist;
	}
}

